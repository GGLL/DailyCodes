package com.dao;

import com.po.MyUser;

public class UserDao {
public boolean checkUser(MyUser user){
	if("admin".equals(user.getUsername()) && "admin".equals(user.getPassword())){
		return true;
	}else{
		return false;
	}
}
}
