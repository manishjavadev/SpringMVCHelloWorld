package com.manish.javadev.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {

		// 1 Creating a ModelAndView Object 
		ModelAndView model = new ModelAndView("helloWorld");
		model.addObject("firstName", "Divya");
		model.addObject("lastName", "Srivastava");
		return model;
	}

}