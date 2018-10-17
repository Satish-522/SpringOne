package com.verizon.ssd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/vault")
public class VaultController {
	@GetMapping("/welcome")
	public ModelAndView amishkiduniya(){
		return new ModelAndView("VaultWelcomePage");
	}
}
