package student;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/index")
	public String index() {
		return null;
	}
	@PostMapping("/save")
	public String save(HttpServletRequest req) {
		DataAccess<StudentModel> iDataAccess=new StudentDao();
		
		StudentModel sm=new StudentModel();
		sm.setId(Long.parseLong(req.getParameter("id")));
		sm.setName(req.getParameter("name"));
		sm.setAddress(req.getParameter("address"));
		
		
		
		iDataAccess.save(sm);
		return "student/index";
	}

}
