package app.controller;

import app.DTO.AnswerDTO;
import app.model.Users;
import app.service.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "user")
public class UserController {

	@Autowired
	private UserService userService;


	@RequestMapping(value = "/list")
	//handles all http requests, more specified @RequestMapping(path="/processUser", method=RequestMethod.GET) or short-cut->@GetMapping(/processUser) //for POST the same
	public String listUsers(Model model) {
		List<Users> allUsers = userService.findAllUsers();
		model.addAttribute("users", allUsers);
		return "home";

	}

	/*@RequestMapping(value = "/list-users", method = RequestMethod.GET)
	public @ResponseBody List<Users> getAllUsers() {
		List<Users> allUsers = userService.findAllUsers();

		return allUsers;
	} //*/
	@RequestMapping(value = "/list-users", method = RequestMethod.GET)
	public @ResponseBody Model getAllUsers(Model model) {
		List<Users> allUsers = userService.findAllUsers();
		model.addAttribute("users", allUsers);
		return model;
	}

	@ResponseBody
	@RequestMapping(value = "/findUsers", method = RequestMethod.GET)
	public AnswerDTO findUsers(@RequestParam String filter){
		return new AnswerDTO(userService.findUsersByFilter(filter));
	}
}
