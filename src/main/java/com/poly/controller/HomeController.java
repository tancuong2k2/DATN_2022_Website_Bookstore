package com.poly.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/admin/index")
	public String index() {
		return "user/index";
	}
	
	@RequestMapping("/cart")
	public String shoppingCart() {
		return "user/shoppingCart";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "user/login";
	}
	
	@RequestMapping("/register")
	public String register() {
		return "user/register";
	}
	
	@RequestMapping("/checkout")
	public String checkout() {
		return "user/checkout";
	}
	
	@RequestMapping("/forgotPassword")
	public String forgotpassword() {
		return "user/forgotPassword";
	}
}
