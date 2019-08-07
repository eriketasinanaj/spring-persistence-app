package com.eapp.persistence.repository;
 
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specifications;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eapp.persistence.model.User;

import javax.persistence.Tuple;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

	// id_application, id_role, is_active, deleted
	User findUserByIdApplication(Long idApplication);
	User findUserByIdApplicationAndIsActive(Long idApplication, Boolean isActive);
	User findUserByIdApplicationAndDeleted(Long idApplication, Boolean deleted);
	User findUserByIdApplicationAndIsActiveAndDeleted(Long idApplication, Boolean isActive,  Boolean deleted);

	Page<User> findAllByIdApplicationOrderByDateCreatedDesc(Long idApplication, Pageable pageable);

	User findUserByAuthToken(String authToken);
	User findUserByEmailAndPasswordAndActiveAndDeleted(String email, String password, Boolean active, Boolean deleted);
	User findUserByRefreshTokenAndRefreshTokenExpirationGreaterThanEqual(String refreshToken, Timestamp timestamp);

}

