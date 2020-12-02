package supplier;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/supplier")
public class StudentController {
	
	@GetMapping("/index")
	public String index() {
		return null;
	}
	@PostMapping("/save")
	public String save(HttpServletRequest req) {
		DataAccess<SupplierModel> iDataAccess = new SupplierDao();
		SupplierModel sm= new SupplierModel();
		sm.setId(Long.parseLong(req.getParameter("id")));
		sm.setName(req.getParameter("name"));
		sm.setAddress(req.getParameter("address"));
		iDataAccess.save(sm);
		return "supplier/index";
	}

}
