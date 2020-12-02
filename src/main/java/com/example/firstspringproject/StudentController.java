package com.example.firstspringproject;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")

public class StudentController {
	
	@PostMapping("/save")
	public String save(HttpServletRequest req) {
		DataAccess da=new StudentDao();
		Student st=new Student();
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		long uid =Long.parseLong(id);
		st.setId(uid);
		st.setName(name);
		st.setAddress(address);
		da.save(st);
		
		
		return "show";
	}

}
