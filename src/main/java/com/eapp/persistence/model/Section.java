package com.eapp.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Section {
    private Long sectionId;
    private Long idApplication;
    private String sectionName;

    @Id
    @Column(name = "section_id")
    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    @Basic
    @Column(name = "id_application")
    public Long getIdApplication() {
        return idApplication;
    }

    public void setIdApplication(Long idApplication) {
        this.idApplication = idApplication;
    }

    @Basic
    @Column(name = "section_name")
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Section section = (Section) o;

        if (sectionId != null ? !sectionId.equals(section.sectionId) : section.sectionId != null) return false;
        if (idApplication != null ? !idApplication.equals(section.idApplication) : section.idApplication != null)
            return false;
        if (sectionName != null ? !sectionName.equals(section.sectionName) : section.sectionName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sectionId != null ? sectionId.hashCode() : 0;
        result = 31 * result + (idApplication != null ? idApplication.hashCode() : 0);
        result = 31 * result + (sectionName != null ? sectionName.hashCode() : 0);
        return result;
    }
}
