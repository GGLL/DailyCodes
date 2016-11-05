package manager;

import dao.UserDao;

public class UserManagerImpl implements UserManager {

	private UserDao userDao;
	/*public UserManagerImpl(UserDao userDao){
		this.userDao = userDao;
	}*/
	public void addUser(String username, String pwd) {
		// TODO Auto-generated method stub
		userDao.addUser(username, pwd);
	}
	public UserDao getUserDao() {
		return userDao;
	}
	public void setUserDao1(UserDao userDao) {
		this.userDao = userDao;
	}

}
