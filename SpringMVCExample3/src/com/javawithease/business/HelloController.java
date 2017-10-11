package com.javawithease.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	   @RequestMapping("/sayHello")  
	   public ModelAndView sayHello() {
	      String message = "Spring MVC Hello World Example.";
	      return new ModelAndView("helloWorld", "message", message);  
	   }
}
