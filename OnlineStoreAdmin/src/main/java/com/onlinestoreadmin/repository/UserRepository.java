package com.onlinestoreadmin.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinestoreadmin.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
