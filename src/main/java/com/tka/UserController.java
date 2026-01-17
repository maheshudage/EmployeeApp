package com.tka;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tka.model.Users;
import com.tka.service.UserService;

//@RestController //restful api [content - JSON]	

@Controller
public class UserController {

	@Autowired
	UserService us;

	// disptacherServlet mapping > tomcat
	@GetMapping("/")

	// disptacherServlet-Handler --> api-method run
	public String m1() {
		return "index.jsp"; // ssrc/main/resources/static/file
	}

	@GetMapping("/login") // disptacher servlet
	public String getLogin() { // disptacher handler
		return "login.jsp"; // view resolver
	}

	@PostMapping("/verify-login")
	public String verifyLoginDetails(@ModelAttribute Users user, Model model) {
		System.out.println("username : " + user.getUsername());
		System.err.println("password : " + user.getPassword());
		if (us.verifyLoginDetails(user)) {
			model.addAttribute("msg", "Log in successful!");
			return "/home.jsp"; // get pages html not
		} else {
			model.addAttribute("msg", "Invalid Username or password");
			return "login.jsp";
		}
	}

	@PostMapping("/home")
	public String home() {
		return "home.jsp"; // get pages html not
	}

	@GetMapping("/get-all-user-details") // disptacher servlet
	public String getAllUsers(Model model) { // disptacher handler
		List<Users> userList =us.getAllUsers();
		model.addAttribute("userList", userList);
		return "getAllUserDetails.jsp"; // view resolver
	}

	@GetMapping("/register-user")
	public String registerUser() {
		return "registerUser.jsp";
	}

	@PostMapping("/save-user")
	public String saveUser(@ModelAttribute Users user, Model model) {
		System.out.println(user.getUsername());
		us.saveUser(user);
		model.addAttribute("msg", "User saved successfully!");
		return "/index.jsp";
	}

}
