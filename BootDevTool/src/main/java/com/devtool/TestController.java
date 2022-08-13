package com.devtool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
     @RequestMapping("/home")
     @ResponseBody
	public String Home()
	{
	int a=88;
	int b=88;
	int c=1000;
		
		return "This is just testing and the sum of a and b  and c is "+(a+b+c);
	}
}
