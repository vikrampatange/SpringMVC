package com.vikram.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController 
{
	
	
	@RequestMapping("/listUsers")
	public ModelAndView listUsers()
	{
		return new ModelAndView("listUsers", "listUsersMessage", "list of users return");
		
	}
	
	@RequestMapping("/saveUser")
	public ModelAndView saveUser(com.vikram.model.User user)
	{
		return new ModelAndView("saveUser", "saveUserMessage", "user data is saved");
		
	}
	
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(com.vikram.model.User user)
	{
		return new ModelAndView("deleteUser", "deleteUserMessage", "user data  is deleted ");
		
	}
	
	

}
