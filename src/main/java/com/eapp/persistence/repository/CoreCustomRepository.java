package com.eapp.persistence.repository;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CoreCustomRepository {
	
	public List<Map<String, Object>> runQyery(String sql);
}
