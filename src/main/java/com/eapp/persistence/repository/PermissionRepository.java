package com.eapp.persistence.repository;

import com.eapp.persistence.model.Permission;
import com.eapp.persistence.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long>, JpaSpecificationExecutor<Permission> {

    List<Permission> findByIdApplication(Long idApplication, Long idSection);
    List<Permission> findByIdApplicationAndIdSection(Long idApplication, Long idSection);
    List<Permission> findByIdApplicationAndIdSectionAndDeleted(Long idApplication, Long idSection, Boolean deleted);


}

