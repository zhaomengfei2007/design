package com.interpreter;

public class Client {
	public static void main(String[] args) {
		Context context = new Context("10");
		new MinusExpression().interpret(context);
		new PlusExpression().interpret(context);
		new MinusExpression().interpret(context);
		new PlusExpression().interpret(context);
		System.out.println(context.getOut());
	}
}
