package com.eapp.persistence.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.eapp.persistence.model.User;

@Repository
public interface UserCustomRepository {
	
	public List<User> getCustomUsers();
	public boolean checkUserPermissions(String userId, String controllerName, String methodName);
}
