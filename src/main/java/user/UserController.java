package user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/index")
	public String index() {
		return null;
	}
	@GetMapping("/save")
	public String save(HttpServletRequest req) {
		DataAccess<UserModel> iDataAccess =new UserDao();
		UserModel um= new UserModel();
		um.setId(Long.parseLong(req.getParameter("id")));
		um.setName(req.getParameter("name"));
		um.setAddress(req.getParameter("address"));
		
		
		iDataAccess.save(um);
		
		return "user/index";
	}

}
