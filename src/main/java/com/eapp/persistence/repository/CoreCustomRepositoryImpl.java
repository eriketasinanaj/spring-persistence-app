package com.eapp.persistence.repository;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Map;

@Repository
public class CoreCustomRepositoryImpl implements CoreCustomRepository {

 
	@PersistenceContext
	private EntityManager entityManager;

	public List<Map<String, Object>> runQyery(String sql){

		Query query = entityManager.createNativeQuery(sql);
	 

		@SuppressWarnings("unchecked")
		List<Map<String, Object>> resultList = query.getResultList();
		
		return resultList;
	}
 
	
	 
}
