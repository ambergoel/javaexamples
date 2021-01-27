package io.agoel;

public class TypeInfrenceLambdaExample {

	public static void main(String[] args) {
		
		StringLengthLambda myLambda = (String s) -> s.length();
		System.out.println(myLambda.stringLength("Hello"));
		
		printstatement((s) -> s.length());
		
	}
	
	static void printstatement(StringLengthLambda l) {
		System.out.println(l.stringLength("myString"));
	}
	
}

interface StringLengthLambda {
	int stringLength(String s);
}
