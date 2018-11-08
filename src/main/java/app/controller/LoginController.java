package app.controller;

import app.model.UserAuth;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.BindingProvider;

@Controller

public class LoginController {

	@GetMapping(value="/showLoginPage")
	public String showLoginPage(Model theModel) {
		//UserAuth userAuth = new UserAuth();
		theModel.addAttribute("userAuth", new UserAuth());
		return "login-form";
	}


	@PostMapping(value="/authenticateTheUser")
	public  String authenticateTheUser(@ModelAttribute("userAuth")UserAuth userAuth) { //@ModelAttribute("userAuth")UserAuth userAuth

		System.out.println("userAuth " + userAuth.getLogin() + userAuth.getPassword());
		return "redirect:/chat/user/list";
	}
}
