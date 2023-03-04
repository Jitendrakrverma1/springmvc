package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.search.Student;
//import springmvc.service.UserService;

@Controller
public class ContactController 
{
//	@Autowired
//	private UserService userService;
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header", "Learn With Jitendra");
		m.addAttribute("Desc", "Home for Programmer");
		System.out.println("adding common data to model");
	}
	
	// it return contact view
	@RequestMapping("/contact")
	public String showForm(Model m) 
	{
		return "contact";
	}

	// using @ModelAttribute
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@ModelAttribute User user, Model model) or
//	public String handleForm(@ModelAttribute("user") User user, Model model)
	
	public String handleForm(@ModelAttribute("student") Student student, Model model)
	{
		System.out.println(student);
		//this.userService.createUser(user);
		System.out.println(student.getAddress());
		return "success";
	}
}









/*
 * @RequestMapping(path="/processform" , method = RequestMethod.POST) public
 * String handleForm(
 * 
 * @RequestParam("email") String UserEmail,
 * 
 * @RequestParam("userName")String userName,
 * 
 * @RequestParam("password") String userPassword , Model model) { //
 * System.out.println("user Email: "+UserEmail); //
 * System.out.println("user Name: "+userName); //
 * System.out.println("userPassword: "+userPassword);
 * 
 * User user = new User(); user.setEmail(UserEmail); user.setUserName(userName);
 * user.setPassword(userPassword); System.out.println(user);
 * model.addAttribute("user",user);
 *
 * //process // model.addAttribute("name",userName); //
 * model.addAttribute("email",UserEmail); //
 * model.addAttribute("password",userPassword); //
 * 
 * 
 * return "success"; }
 */