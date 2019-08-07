package com.eapp.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Permission {
    private Long permissionId;
    private Long idApplication;
    private Long idSection;
    private String controllerName;
    private String controllerFriendlyName;
    private String methodName;
    private String methodFriendlyName;
    private String description;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean deleted;

    @Id
    @Column(name = "permission_id")
    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
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
    @Column(name = "id_section")
    public Long getIdSection() {
        return idSection;
    }

    public void setIdSection(Long idSection) {
        this.idSection = idSection;
    }

    @Basic
    @Column(name = "controller_name")
    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    @Basic
    @Column(name = "controller_friendly_name")
    public String getControllerFriendlyName() {
        return controllerFriendlyName;
    }

    public void setControllerFriendlyName(String controllerFriendlyName) {
        this.controllerFriendlyName = controllerFriendlyName;
    }

    @Basic
    @Column(name = "method_name")
    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Basic
    @Column(name = "method_friendly_name")
    public String getMethodFriendlyName() {
        return methodFriendlyName;
    }

    public void setMethodFriendlyName(String methodFriendlyName) {
        this.methodFriendlyName = methodFriendlyName;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "created_at")
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Permission that = (Permission) o;

        if (permissionId != null ? !permissionId.equals(that.permissionId) : that.permissionId != null) return false;
        if (idApplication != null ? !idApplication.equals(that.idApplication) : that.idApplication != null)
            return false;
        if (idSection != null ? !idSection.equals(that.idSection) : that.idSection != null) return false;
        if (controllerName != null ? !controllerName.equals(that.controllerName) : that.controllerName != null)
            return false;
        if (controllerFriendlyName != null ? !controllerFriendlyName.equals(that.controllerFriendlyName) : that.controllerFriendlyName != null)
            return false;
        if (methodName != null ? !methodName.equals(that.methodName) : that.methodName != null) return false;
        if (methodFriendlyName != null ? !methodFriendlyName.equals(that.methodFriendlyName) : that.methodFriendlyName != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = permissionId != null ? permissionId.hashCode() : 0;
        result = 31 * result + (idApplication != null ? idApplication.hashCode() : 0);
        result = 31 * result + (idSection != null ? idSection.hashCode() : 0);
        result = 31 * result + (controllerName != null ? controllerName.hashCode() : 0);
        result = 31 * result + (controllerFriendlyName != null ? controllerFriendlyName.hashCode() : 0);
        result = 31 * result + (methodName != null ? methodName.hashCode() : 0);
        result = 31 * result + (methodFriendlyName != null ? methodFriendlyName.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }
}
