package com.vikram.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vikram.model.User;

@Controller
public class HelloWorldController
{
	@RequestMapping("/hello")
	public ModelAndView helloWorld()
	{
		
		
			String modelName="Hello i am from HelloWorldCOntroller";
		    return  new ModelAndView("hellopage", modelName, new User());
		
	}
	
	

}
