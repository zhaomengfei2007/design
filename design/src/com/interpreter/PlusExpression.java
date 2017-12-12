package com.interpreter;

public class PlusExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		String in = context.getIn();
		int v = Integer.parseInt(in);
		context.setOut(++v);
	}

}
