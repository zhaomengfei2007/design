package com.iterator.whitebox;

public class Client {
	public void operation(){
		Object[] objArray = {"One","Two","Three","Four","Five","Six"};
		Aggregate agg = new ConcreteAggregate(objArray);
		Iterator it = agg.createIterator();
		while(!it.isDone()){
			System.out.println(it.currentItem());
			it.next();
		}
	}
	public static void main(String[] args) {
		Client client = new Client();
		client.operation();
	}
}
