package com.factory.simple;

public class Test {
		public static void main(String [] args){
			SimpleFactory simpleFactory = new SimpleFactory();
			Phone phone=(Phone) simpleFactory.create(Phone.class);
			phone.run();
		}
}
