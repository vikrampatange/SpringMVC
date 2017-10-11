package com.javawithease.business;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	   @RequestMapping("/sayWelcome")  
	   public ModelAndView sayHello() 
	   {
	      String message = "Welcome to the world of spring.";
	      return new ModelAndView("welcome", "message", message);  
	   }
}
