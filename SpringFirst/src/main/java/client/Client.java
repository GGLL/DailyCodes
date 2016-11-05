package client;

import manager.UserManager;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	public static void main(String[] args){
		//BeanFactory factory = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		ApplicationContext factory = new ClassPathXmlApplicationContext("resources/applicationContext.xml");
		UserManager userManager = (UserManager)factory.getBean("userManager");
		userManager.addUser("ge.l", "GG");
	}
}
