package com.karadayi.kodstar.controller;




import com.karadayi.kodstar.entities.User;
import com.karadayi.kodstar.repos.UserRepository;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class UserController {
	
  //Loglama için
  private static final  Logger logger= LoggerFactory.getLogger(UserController.class);
  
	/*
	 * @Autowired private BCryptPasswordEncoder encoder;
	 */

	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/Hello")
	public String HelloWorld() {
		return "Hello World!";
	}
	
	
	@RequestMapping("/showUserLogin")
	public String showUserLogin(){
		
		logger.info("You are now in showUserLogin() method.");
	
		return "login/userLogin";
	}
	

	
	
	@RequestMapping("/showUserRegister")
	public String showUserRegister(){
		
		logger.info("You are now in showUserRegister method.");
	
		return "login/userRegister";
	}
	
	@RequestMapping(value="/saveUser" ,method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("User") User user ){
		
		logger.info("You are now in saveUser() method with user: "+user);
		

	//	user.setPassword(encoder.encode(user.getPassword()));
		
		userRepository.save(user);
	
		return "login/userLogin";
	}
	
	
	
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,ModelMap modelMap ) {
		
		logger.info("You are now in login() method with user's: "+email );
		
		User user = userRepository.findByEmail(email);
		if(user.getPassword().equals(password))
			return "mainPage";
		
		
		modelMap.addAttribute("msg", "Yanlış Kullanıcı Adı veya Şifre,Lütfen Tekrar Deneyiniz");
		
		return "login/userLogin";
	}
	
	
	

}