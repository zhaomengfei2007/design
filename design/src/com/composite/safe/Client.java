package com.composite.safe;

public class Client {
	public static void main(String[] args) {
		IRes singleRes = new SingleResImpl("雪糕", 1.5f);
		singleRes.pay();
		
		IRes allRes = new MultiResImpl();
		IRes one = new MultiResImpl();
		((MultiResImpl) allRes).addRes(one);//把一楼的东西装在购物车里
		((MultiResImpl) one).addRes(new SingleResImpl("旺旺", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("糖果", 38.0f));
		((MultiResImpl) one).addRes(new SingleResImpl("可乐", 8.5f));

		IRes two = new MultiResImpl(); 
		((MultiResImpl) allRes).addRes(two);// 把二楼的东西装也装在购物车里  
		((MultiResImpl) two).addRes(new SingleResImpl("衣服", 130.5f));
		((MultiResImpl) two).addRes(new SingleResImpl("袜子", 10f));
        
		IRes bao = new MultiResImpl();  
		((MultiResImpl) two).addRes(bao);//把购物小包装在二楼购物车里  
		((MultiResImpl) bao).addRes(new SingleResImpl("手表", 100f));

		((MultiResImpl) one).addRes(new SingleResImpl("苹果", 10.0f));
		((MultiResImpl) one).addRes(new SingleResImpl("梨", 3.0f));

		((MultiResImpl) one).removeRes(new SingleResImpl("可乐", 8.5f));

		allRes.pay();
	}
}
