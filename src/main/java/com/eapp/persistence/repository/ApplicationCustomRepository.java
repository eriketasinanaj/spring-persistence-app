package com.eapp.persistence.repository;

import com.eapp.persistence.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationCustomRepository {
	
	public boolean testa(String userId, String controllerName, String methodName);
}
