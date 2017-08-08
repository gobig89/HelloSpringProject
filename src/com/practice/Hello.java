package com.practice;

import javax.jws.soap.SOAPBinding;

public class Hello {
	public Hello() {
		System.out.println("Hello constructor");
	}

	public String message;

	public void getMessage() {
		System.out.println("Your Message"+ message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
