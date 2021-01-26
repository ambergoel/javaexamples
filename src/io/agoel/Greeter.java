package io.agoel;

public class Greeter {

	private void greeting() {
		System.out.println("hello world");
	}

	public static void main(String[] args) {
	
		Greeter greeter = new Greeter();
		greeter.greeting();
	}
}
