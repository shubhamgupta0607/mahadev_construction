package com.mahadevConst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping(value="/demo")
	public String demoMethod(){
		
		System.out.println("Controller calls");
		return "helloWorld";
	}
	
	
}
