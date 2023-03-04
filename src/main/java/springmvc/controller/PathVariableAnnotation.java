package springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class PathVariableAnnotation 
{
//	@RequestMapping("/book/{id}")
//   public String getUser(@PathVariable("id") int id)
//   {
//	  System.out.println("going to view");
//	  System.out.println(id);
//	  return "contact";
//   }
	
	@RequestMapping("/book")
	public String getUser()
	   {
		  System.out.println("going to view");
		  String str = null;
		  System.out.println(str.length());
		  return "contact";
	   }
	
//	@ExceptionHandler
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)  here we can send status if error occured
	
//	@ExceptionHandler(NullPointerException.class)
//	public String exceptionHandler()
//	{
//		return "error";
//	}
	
	// exception is handled by MyExceptionHandler.java class.......>
}
