package com.eapp.persistence.repository;

import com.eapp.persistence.model.Permission;
import com.eapp.persistence.model.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionRepository extends JpaRepository< RolePermission, Long>, JpaSpecificationExecutor<RolePermission> {



}

