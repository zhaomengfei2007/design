package com.responsibleityChain;

public class ConcreteHandler extends Handler {
	@Override
	public void handleRequest() {
		if(getSuccessor() != null) {
			System.out.println("放过请求");
			this.getSuccessor().handleRequest();
		}else{
			System.out.println("处理请求");
		}
	}
}
