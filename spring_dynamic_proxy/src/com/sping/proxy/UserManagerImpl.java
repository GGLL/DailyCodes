package com.sping.proxy;

public class UserManagerImpl implements UserManager {

	public UserManagerImpl() {
		
	}

	@Override
	public void addUser(String username, String password) {
		System.out.println("----------UserManagerImpl.addUser------------");
	}

	@Override
	public void delUser(int userId) {
		System.out.println("----------UserManagerImpl.delUser------------");
	}

	@Override
	public String findUserById(int userId) {
		System.out.println("----------UserManagerImpl.findUserById------------");
		return null;
	}

	@Override
	public void modifyUser(int userId, String username, String password) {
		System.out.println("----------UserManagerImpl.modifyUser------------");
	}

}
