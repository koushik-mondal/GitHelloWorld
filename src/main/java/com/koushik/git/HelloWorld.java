package com.koushik.git;

public class HelloWorld {
	
	public String sayHello(String input) {
		if (input == null || input.trim().equals("")) {
			throw new IllegalArgumentException("Input cannot be empty");
		}
		
		return "Hello " + input;
	}
	
	public String askHello(String input) {
		if (input == null || input.trim().equals("")) {
			throw new IllegalArgumentException("Input cannot be empty");
		}
		
		return "Hello " + input;
	}
	
	public void checkBranch() {
		System.out.println("JUst checking the branch functionality");
	}

}
