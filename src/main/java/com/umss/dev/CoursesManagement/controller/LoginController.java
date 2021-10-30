package com.umss.dev.CoursesManagement.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.umss.dev.CoursesManagement.model.UsuarioPrueba;


@RestController
public class LoginController {
	
	@GetMapping("/auth/login")
	public String login(Model model) {
		model.addAttribute("usuario", new UsuarioPrueba());
		
		return "login";
		
	}

}