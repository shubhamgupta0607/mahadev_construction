package com.mahadevConst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/homePage", method = RequestMethod.GET)
	public String adminHomePage() {
		return "adminHome";

	}
	
	@RequestMapping(value="/mahadevBhawanNirman", method = RequestMethod.GET)
	public String mahadevNirbhayaBhawan(){
		return "mahadevBhawanNirman";
	}
	
	@RequestMapping(value="/materialRange", method= RequestMethod.GET)
	public String materialRange(){
		return "materialRange";
	}
	
	@RequestMapping(value="/vendor", method= RequestMethod.GET)
	public String vendor(){
		return "vendor";
	}
	
	@RequestMapping(value="/customer", method= RequestMethod.GET)
	public String customer(){
		return "customer";
	}
	
	@RequestMapping(value="/labour", method= RequestMethod.GET)
	public String labour(){
		return "labour";
	}
	
	@RequestMapping(value="/stock", method= RequestMethod.GET)
	public String stock(){
		return "stock";
	}
}
