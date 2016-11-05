package com.sping.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecurityHandler implements InvocationHandler {

	private Object targetObject;
	
	public Object createProxyInstance(Object object){
		this.targetObject = object;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
				targetObject.getClass().getInterfaces(),
				this);
	}
	
	public SecurityHandler() {
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		checkSecurity();
		return method.invoke(targetObject, args);
	}

	private void checkSecurity(){
		System.out.println("----------SecurityHandler.checkSecurity------------");
	}
}
