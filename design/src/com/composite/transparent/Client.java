package com.composite.transparent;

public class Client {
	public static void main(String[] args) {
		IRes singleRes = new SingleResImpl("雪糕", 1.5f);  
        singleRes.pay();  
        IRes allRes = new MultiResImpl();  
        IRes one = new MultiResImpl();  
        allRes.addRes(one);

        one.addRes(new SingleResImpl("旺旺", 28.5f));  
        one.addRes(new SingleResImpl("糖果", 38.0f));  
        one.addRes(new SingleResImpl("可乐", 8.5f));  
   
        IRes two = new MultiResImpl();  
        allRes.addRes(two);
        two.addRes(new SingleResImpl("衣服", 130.5f));  
        two.addRes(new SingleResImpl("袜子", 10f));  

        IRes bao = new MultiResImpl();  
        two.addRes(bao);
        bao.addRes(new SingleResImpl("手表", 100f));
        one.addRes(new SingleResImpl("苹果", 10.0f));  
        one.addRes(new SingleResImpl("梨", 3.0f));
        one.removeRes(new SingleResImpl("可乐", 8.5f));  

        allRes.pay();
	}
}
/*
 * 
 * 安全方式：抽象构件上只提供树叶和树枝公共的方法，没提供树枝独有的管理等方法（add,remove）。
 * 这样的好处是安全，用户不会在树叶上使用add()等管理方法，
 * 缺点是不够透明，用户必须知识当前对象为树叶还是树枝（向下转型）。
 * 
 * 透明方式：抽象构件上提供了满足树枝的所有方法（包括add(),remove()），
 * 这样做的好处是，用户可以任意执行对象的add()和remove()管理对象。
 * 缺点是如果用户在树叶上执行管理方式（add(),remove()）时，在编译期不会有错，但在执行期会
 * 报错，这样不容易被发觉错误出在哪.
 */
