package com.practice.java._23lambdaexpressionsandstreams;

interface Greetings{
	String greeetingMessage(String message, String name);
}

public class _2LambdaGreetings {
	public static void main(String[] args) {
		String message = "Hello, ";
		Greetings g1 = (greetingMessage, greetedPerson)->(greetingMessage+greetedPerson);
		System.out.println(g1.greeetingMessage(message, "Captain"));
		
		Greetings g2 = (String greetingMessage, String greetedPerson) -> {
			return greetingMessage + greetedPerson;	
		};
		System.out.println(g1.greeetingMessage(message, "Sir"));		
	}
}
