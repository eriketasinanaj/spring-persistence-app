package com.eapp.persistence.repository;

import com.eapp.persistence.model.Role;
import com.eapp.persistence.model.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SectionRepository extends JpaRepository<Section, Long>, JpaSpecificationExecutor<Section> {

    List<Section> findByIdApplication(Long idApplication);

}

