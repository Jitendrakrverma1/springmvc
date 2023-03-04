package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/first")
public class HomeController 
{
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is home page url");
		// add string 
		model.addAttribute("name", "Verma");
		// add id means integrer
		model.addAttribute("id", 111);
		// add list
		List<String> friends = new ArrayList<String>();
		friends.add("Ram");
		friends.add("Annop");
		friends.add("Chay");
		friends.add("ABC");
		model.addAttribute("f", friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is about controller");
		return "about";
	}
	
	// using ModelAndView  =>object hai
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is help page conteroller");
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		// setting the data
		modelAndView.addObject("name", "Uttam");
		modelAndView.addObject("rollno", 111);
		LocalDateTime l =  LocalDateTime.now();
		modelAndView.addObject("time", l);
		
		//marks
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(12);
		marks.add(13);
		marks.add(14);
		modelAndView.addObject("marks",marks);
		// setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
		
	}

}
