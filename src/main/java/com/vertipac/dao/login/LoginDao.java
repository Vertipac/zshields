package com.vertipac.dao.login;

import com.vertipac.models.login.Users;



public interface LoginDao {
	Users findByUserName(String username);
}
