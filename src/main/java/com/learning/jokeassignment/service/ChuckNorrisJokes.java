/**
 * 
 */
package com.learning.jokeassignment.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Aditya Ajmera
 *
 */
@Service
public class ChuckNorrisJokes implements JokeService {

	private ChuckNorrisQuotes quotes;
	
	/**
	 * @param quotes
	 */
	public ChuckNorrisJokes() {
		super();
		this.quotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}

}
