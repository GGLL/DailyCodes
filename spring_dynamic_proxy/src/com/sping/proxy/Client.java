package com.sping.proxy;

public class Client {

	public static void main(String[] args) {
		SecurityHandler handler = new SecurityHandler();
		UserManager manager = (UserManager)handler.createProxyInstance(new UserManagerImpl());
		manager.addUser("zhangsan", "123");
	}

}
