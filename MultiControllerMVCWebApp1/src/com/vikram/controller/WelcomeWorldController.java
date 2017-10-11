package com.vikram.controller;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WelcomeWorldController 
{
	@RequestMapping("/welcome")
	public ModelAndView helloWorld()
	{
		
		String modelName="Hello I am from WelcomeWorldController";
		return new ModelAndView("welome", modelName, new User());
		
		
	}
}
