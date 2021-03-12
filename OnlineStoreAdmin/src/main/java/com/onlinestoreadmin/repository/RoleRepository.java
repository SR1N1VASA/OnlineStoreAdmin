package com.onlinestoreadmin.repository;

import org.springframework.data.repository.CrudRepository;

import com.onlinestoreadmin.domain.security.Role;


public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
