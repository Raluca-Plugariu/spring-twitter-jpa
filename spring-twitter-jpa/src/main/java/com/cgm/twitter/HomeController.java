package com.cgm.twitter;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cgm.domain.Message;
import com.cgm.domain.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String getLoginPage() {
		
		
		return  "home";
	}
	
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		
		return "register";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST,consumes = "application/json", produces = "application/json")
	public  @ResponseBody User login(@ModelAttribute ("account") User user, Map model ) {
		System.out.println("test");
		
		return user;
	}
}
