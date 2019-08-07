package com.eapp.persistence.repository;

import com.eapp.persistence.model.MobileApp;
import com.eapp.persistence.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface MobileAppRepository extends JpaRepository<MobileApp, Long>, JpaSpecificationExecutor<MobileApp> {

	List<MobileApp> findByIdApplication(Long idApplication, Long idSection);
	List<MobileApp> findByMobileAppId(Long mobileAppId);
	List<MobileApp> findByMobileAppIdAndIdApplication(Long mobileAppId, Long idApplication);
	List<MobileApp> findByAppDomain(String appDomain);
	List<MobileApp> findByDeviceUuid(String deviceUuid);

}

