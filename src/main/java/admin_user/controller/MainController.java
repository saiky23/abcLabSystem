package admin_user.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import admin_user.dto.AppointmentDto;
import admin_user.dto.UserDto;
import admin_user.service.AppointmentService;
import admin_user.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	private UserService userService;

	@Autowired
	private AppointmentService appointmentService;

	
	//registration
	@GetMapping("/registration")
	public String getRegistrationPage(@ModelAttribute("user") UserDto userDto) {
		return "register";
	}
	
	@PostMapping("/registration")
	public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
		userService.save(userDto);
		model.addAttribute("message", "Registered Successfuly!");
		return "login";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/check")
    public String check() {
        return "check-appointments"; 
    }

    @GetMapping("/newch")
    public String newch(@ModelAttribute("appointment") AppointmentDto appointmentDto) {
        return "add-appointment";
	}

	@PostMapping("/save-appoinment")
	public String saveAppointment(@ModelAttribute("appointment") AppointmentDto appointmentDto, Model model) {
		appointmentService.save(appointmentDto);
		model.addAttribute("message", "Appoinment Saved Successfuly!");
		return "payment";
	}

	@GetMapping("/payment")
    public String payment() {
        return "payment";
	}

	@GetMapping("user-page")
	public String userPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "user";
	}
	
	@GetMapping("admin-page")
	public String adminPage (Model model, Principal principal) {
		UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
		model.addAttribute("user", userDetails);
		return "admin";
	}

}

