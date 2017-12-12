package com.proxy.dynamics.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/*
 * 可以使用cglib来实现继承式的动态代理。
 */
public class CGLibProxy implements MethodInterceptor {
	private Enhancer enhancer = new Enhancer();
	public Object getProxy(Class<?> clazz){
		enhancer.setSuperclass(clazz); 
		enhancer.setCallback(this);
		return enhancer.create();
	}
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		proxy.invokeSuper(obj, args);
		return null;
	}

}
