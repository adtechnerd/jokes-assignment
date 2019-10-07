/**
 * 
 */
package com.learning.jokeassignment;

import org.springframework.stereotype.Component;

/**
 * @author 609734641
 *
 */
@Component
public class Joke {

	private String joke;

	public String getJoke() {
		return joke;
	}

	public void setJoke(String joke) {
		this.joke = joke;
	}
}
