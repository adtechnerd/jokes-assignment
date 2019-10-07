/**
 * 
 */
package com.learning.jokeassignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.jokeassignment.service.JokeService;

/**
 * @author Aditya Ajmera
 *
 */
@Controller
public class JokesController {
	
	private JokeService service;

	/**
	 * @param service
	 */
	public JokesController(JokeService service) {
		super();
		this.service = service;
	}
	
	@RequestMapping
	public String getJokes(Model model) {
		model.addAttribute("joke", service.getJoke());
		return "chucknorris";
	}
}
