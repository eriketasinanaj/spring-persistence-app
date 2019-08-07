package com.eapp.persistence.repository;

import com.eapp.persistence.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ApplicationCustomRepositoryImpl implements ApplicationCustomRepository {

 
	@PersistenceContext
	private EntityManager entityManager;

	public boolean testa(String userId, String controllerName, String methodName){

	/*	String sql = " SELECT COUNT(1) as permission " +
                        " FROM user u  " +
                        " JOIN role_permission rp ON u.id_role = rp.id_role AND rp.deleted = 0 " +
                        " JOIN permission p ON p.permission_id = rp.id_permission AND p.id_application = u.id_application AND p.deleted = 0 " +
                        " WHERE u.deleted = 0 and u.is_active = 1 and u.user_id = :userId AND p.controller_name LIKE :controllerName AND p.method_name LIKE :methodName LIMIT 1 ";

        Query query = entityManager.createNativeQuery(sql);
        query.setParameter("userId", userId);
        query.setParameter("controllerName", controllerName);
        query.setParameter("methodName", methodName);

        String result = query.getSingleResult().toString();


		return "1".equals(result);*/

		return false;
	}
 
	
	 
}
