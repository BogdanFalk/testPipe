package webportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import webportal.forms.UserRegistrationObject;

/**
 * The UserController class is responsible for handling user specific routes.
 * @author uidw6860
 *
 */
@Controller
public class UserController {

	@GetMapping("/user/register")
	public ModelAndView handleRegisterPage() {
		
		ModelAndView modelAndView = new ModelAndView();
		
	    modelAndView.setViewName("user/create");
	    
	    return modelAndView;
	}
	
	@PostMapping("/user/register")
	public ModelAndView doUserRegistration(@ModelAttribute(name="userRegistrationForm") UserRegistrationObject userRegistrationFormData) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		// TODO: Check if the user is not already in the database.
		
		System.out.println("Username: " + userRegistrationFormData.getUsername());
		System.out.println("Passowrd: " + userRegistrationFormData.getPassword());
		System.out.println("Email: " + userRegistrationFormData.getEmail());
		
		modelAndView.setViewName("home");
		
		return modelAndView;
	}
	
	@GetMapping("/profile")
	public ModelAndView handleProfilePage() {
		
		ModelAndView modelAndView = new ModelAndView();
		
	    // TODO: Populate from database
	    modelAndView.addObject("username", "Gicu");
	    modelAndView.addObject("email", "gicu@gicu.com");
		
	    modelAndView.setViewName("user/show");
	    
	    return modelAndView;
	}
	
	@GetMapping("/user/edit")
	public ModelAndView handleRegistration() {
		
		ModelAndView modelAndView = new ModelAndView();
		
	    modelAndView.setViewName("user/edit");
	    
	    // TODO: Populate from database
	    modelAndView.addObject("username", "Gicu");
	    modelAndView.addObject("password", "1");
	    modelAndView.addObject("email", "gicu@gicu.com");
	    
	    return modelAndView;
	}
	
	@PostMapping("/user/update")
	public ModelAndView handleUserProfileUpdate(@ModelAttribute(name="userProfileEditForm") UserRegistrationObject userProfileEdit) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		System.out.println("New Username: " + userProfileEdit.getUsername());
		System.out.println("New Passowrd: " + userProfileEdit.getPassword());
		System.out.println("New email: " + userProfileEdit.getEmail());
		
		// TODO: Save the data in database.
		
	    modelAndView.setViewName("user/show");
	    
	    return modelAndView;
	}
}
