package webportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import webportal.forms.UserLoginObject;

/**
 * The HomeController class is responsible for handling home page specific routes.
 * @author uidw6860
 *
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView handleHomePage() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		// TOOD: Get the devices from the database and populate the dashboard.
		
	    modelAndView.setViewName("login");
	    
	    return modelAndView;
	}
	
	@PostMapping("/login")
	public ModelAndView doLogin(@ModelAttribute(name="loginForm") UserLoginObject loginFormData) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		String zUsername = loginFormData.getUsername();
		String zPassword = loginFormData.getPassword();
		
		if ( ("a".equals(zUsername) ) && ("1".equals(zPassword) ) )
		{
			modelAndView.setViewName("home");
		}
		else
		{
			modelAndView.setViewName("login");
			modelAndView.addObject("invalidCredentials", true);
		}
		
		return modelAndView;
	}
	
	@GetMapping("/home")
	public ModelAndView handleHomePage2() {
		
		ModelAndView modelAndView = new ModelAndView();
		
	    modelAndView.setViewName("home");
	    
	    return modelAndView;
	}
	
	@GetMapping("/logout")
	public ModelAndView handleLogout() {
		
		ModelAndView modelAndView = new ModelAndView();
		
		// TODO: Invalidate the session & redirect to login page.
		
	    modelAndView.setViewName("login");
	    
	    return modelAndView;
	}
}
