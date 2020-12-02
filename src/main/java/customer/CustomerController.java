package customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
@GetMapping("/index")	
public String index() {
	return "customer/index";
}

@PostMapping("/save")	
public String save(HttpServletRequest req) {
	DataAccess<CustomerModel> iDataAccess= new CustomerDao();
	CustomerModel cm= new CustomerModel();
	cm.setId(Long.parseLong(req.getParameter("id")));
	cm.setName(req.getParameter("name"));
	cm.setAddress(req.getParameter("address"));
	iDataAccess.save(cm);
	return "customer/index";
 }

}
