package org.com.exception;

public class InvalidInputFormat extends RuntimeException {
	public InvalidInputFormat(String input, String expression) {
		super(input + " does not meet the regular expression: " + expression);
	}
}
