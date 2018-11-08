package app.controller;

import app.DTO.UserDTO;
import app.model.UserAuth;
import app.model.Users;
import app.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

	@Autowired
	private UserService userService;

	@GetMapping(value = "/showRegistrationForm")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user",  new Users());
		return "registration-form";
	}

	@PostMapping(value = "/submitRegistrationForm")
	public String submitRegistrationForm(@ModelAttribute("user") Users user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "DB_error";
		}
		userService.saveUser(user);
		return "redirect:/chat/user/list";
	}


	/*@GetMapping(value = "/showRegistrationForm")
	public String showRegistrationForm(Model model) {
		Users user = new Users();
		UserAuth userAuth = new UserAuth();
		model.addAttribute("user", user);
		model.addAttribute("userAuth", userAuth);
		return "registration-form";
		}
	*/

	/*@GetMapping(value = "/showRegistrationForm")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user",  new UserDTO());
		return "registration-form";
	}


	@PostMapping(value = "/submitRegistrationForm")
	public String submitRegistrationForm(@ModelAttribute("user") UserDTO userDTO, BindingResult bindingResult) {  //@ModelAttribute("user") - matches to attribute from form
		if (bindingResult.hasErrors()){
			return "DB_error";
		}
		userService.saveUser(userDTO);
		return "redirect:/chat/user/list";
	}*/

}