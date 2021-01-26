package io.agoel;

public class Greeter {

	private void greeting(IGreeting igreeting) {
		igreeting.perform();
		
	}

	public static void main(String[] args) {
	
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greeting(helloWorldGreeting);
		
		MyLambda myLambda = () -> System.out.println("hello world");
		
		myLambda.foo();
		
		
	}
}
