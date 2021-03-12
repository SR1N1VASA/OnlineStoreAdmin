package com.onlinestoreadmin.service;

import java.util.Set;

import com.onlinestoreadmin.domain.User;
import com.onlinestoreadmin.domain.security.UserRole;



public interface UserService {
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	User save(User user);
}
