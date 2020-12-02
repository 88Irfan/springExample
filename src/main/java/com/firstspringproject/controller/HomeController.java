package com.firstspringproject.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.firstspringproject.entity.Student;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("")
	public String home(ModelMap model) {
		List<Student> stList = new ArrayList<Student>();
		Student student = new Student(1, "Riyad");
		Student student2 = new Student(1, "Sabina");
		stList.add(student);
		stList.add(student2);
		model.addAttribute("studentList", stList);
		return "index";
	}
	
	@PostMapping("/save")
	public String save(HttpServletRequest request, ModelMap model) {
		String id = request.getParameter("id");
		long uid = Long.parseLong(id);
		String name = request.getParameter("name");		
		Student st = new Student(uid, name);
		model.addAttribute("student", st);
		return "show";
	}

}
