package vendor;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vendor")
public class VendorController {
	@GetMapping("/index")
	public String index() {
		return null;
	}
	
	
	@PostMapping("/save")
	public String save(HttpServletRequest req) {
		DataAccess<VendorModel> iDataAccess= new VendorDao();
		VendorModel vm= new VendorModel();
		vm.setId(Long.parseLong(req.getParameter("id")));
		vm.setName(req.getParameter("name"));
		vm.setAddress(req.getParameter("address"));
		
		
		iDataAccess.save(vm);
		return "vendor/index";
	}

}
