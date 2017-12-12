package com.interpreter;
/*
 * 解释器模式(Interpreter)
 * 解释器模式属于行为模式，Gof是这样定义的：给定一个语言，定义它的文法的一种表示，并定义一个解释器，
 * 这个解释器使用该表示来解释语言中的句子。
 * 
 * 实例应用：正则表达式
 */
public abstract class AbstractExpression {
	public abstract void interpret(Context context);
}
