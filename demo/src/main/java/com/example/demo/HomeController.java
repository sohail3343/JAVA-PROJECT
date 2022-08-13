package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home()
	{
		int a;
		a=10+10;
		
		
		System.out.println("inside home method");
		return"home";
		
	}

}
