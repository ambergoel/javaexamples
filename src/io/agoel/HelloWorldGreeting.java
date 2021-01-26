package io.agoel;

public class HelloWorldGreeting implements IGreeting {

	@Override
	public void perform() {
		System.out.println("hello world");
	}

}
