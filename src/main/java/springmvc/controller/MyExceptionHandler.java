package springmvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler 
{
	// handling excepto in our spring mvc
	@ExceptionHandler(value= NullPointerException.class)
	public String exceptionHandlerNull()
	{
		return "error";
	}
	
	@ExceptionHandler(value= NumberFormatException.class)
	public String exceptionHandlerNumberFormat()
	{
		return "error";
	}
	@ExceptionHandler(value= Exception.class)
	public String exceptionHandlerGeneric()
	{
		return "error";
	}

}
