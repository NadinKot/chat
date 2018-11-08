package app.controller;

import org.apache.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;


import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	final Logger logger = Logger.getLogger(GlobalExceptionHandler.class);

/*	@ExceptionHandler(value = NoHandlerFoundException.class)
	public ModelAndView handleError404(HttpServletRequest request, Exception e)   {
		ModelAndView mav = new ModelAndView("/404");
		mav.addObject("exception", e);
		return mav;
}*/

	@ExceptionHandler(value = NoHandlerFoundException.class)
	protected String handle404(Exception exc, HttpServletRequest request){
		logger.warn("The page you requested is not available. The URL of the page was :"+request.getRequestURL() + ". You faced with the next exception: "+ exc.getMessage());
		return "404";
	}

	@ExceptionHandler(value = Exception.class)
	protected String representation404(Exception exc, HttpServletRequest request){
		logger.warn("did not find a current representation");
		return "404";
	}


}