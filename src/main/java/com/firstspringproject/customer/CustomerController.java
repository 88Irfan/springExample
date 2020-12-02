package com.firstspringproject.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// request handle 
@RequestMapping("/customer")
public class CustomerController {
	
	@GetMapping("")
	public String index() {
		return "customer/index";
	}
	
	@PostMapping("/save")
	public String save(HttpServletRequest req) {
		// now impl p2p
		DataAccess<CustomerModel> iDataAccess = new CustomerDao(); // object/instance/ dependency for this class
		
		CustomerModel cm = new CustomerModel();
		cm.setId(Long.parseLong(req.getParameter("id")));
		cm.setName(req.getParameter("name"));
		cm.setAddress(req.getParameter("address"));
		
		
		iDataAccess.save(cm);
		
		return "customer/index";
	}

}
