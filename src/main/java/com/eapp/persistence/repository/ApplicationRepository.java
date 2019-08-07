package com.eapp.persistence.repository;

import com.eapp.persistence.model.Application;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>, JpaSpecificationExecutor<Application> {

//    Page<Application> findApplicationsByOrderByDateCreatedDesc(Pageable pageable);
//    Page<Application> findApplicationsByIdUserAndDeletedIsFalseOrderByDateCreatedDesc(Long idUser, Pageable pageable);

    //ADMIN
    //LIST APPLICATINOS
    List<Application> findApplicationsByIdUserAndDeleted(Long idUser, Boolean deleted);

    // GET APPLICATION
    Application findByApplicationIdAndIdUser(Long applicationId, Long idUser);
    Application findByApplicationIdAndIdUserAndActive(Long applicationId, Long idUser, Boolean active);
    Application findByApplicationIdAndIdUserAndDeleted(Long applicationId, Long idUser, Boolean deleted);

    Application findByApplicationIdAndIdUserAndActiveAndDeleted(Long applicationId, Long idUser, Boolean active, Boolean deleted);

    //AUTH
    Application findApplicationByApplicationUidAndApplicationSecretAndActiveAndDeleted(String applicationUid, String applicationSecret, Boolean active, Boolean deleted);
    Application findApplicationByAuthTokenAndAuthTokenExpirationGreaterThanEqual(String authToken, Timestamp authTokenExpiration);
    Application findApplicationByRefreshTokenAndRefreshTokenExpirationGreaterThanEqual(String refreshToken, Timestamp refreshTokenExpiration);

}

