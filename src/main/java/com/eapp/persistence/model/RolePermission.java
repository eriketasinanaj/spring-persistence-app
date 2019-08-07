package com.eapp.persistence.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "role_permission", schema = "app_man", catalog = "")
public class RolePermission {
    private Long rolePermisssionId;
    private Long idRole;
    private Long idPermission;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Boolean deleted;

    @Id
    @Column(name = "role_permisssion_id")
    public Long getRolePermisssionId() {
        return rolePermisssionId;
    }

    public void setRolePermisssionId(Long rolePermisssionId) {
        this.rolePermisssionId = rolePermisssionId;
    }

    @Basic
    @Column(name = "id_role")
    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    @Basic
    @Column(name = "id_permission")
    public Long getIdPermission() {
        return idPermission;
    }

    public void setIdPermission(Long idPermission) {
        this.idPermission = idPermission;
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

        RolePermission that = (RolePermission) o;

        if (rolePermisssionId != null ? !rolePermisssionId.equals(that.rolePermisssionId) : that.rolePermisssionId != null)
            return false;
        if (idRole != null ? !idRole.equals(that.idRole) : that.idRole != null) return false;
        if (idPermission != null ? !idPermission.equals(that.idPermission) : that.idPermission != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deleted != null ? !deleted.equals(that.deleted) : that.deleted != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rolePermisssionId != null ? rolePermisssionId.hashCode() : 0;
        result = 31 * result + (idRole != null ? idRole.hashCode() : 0);
        result = 31 * result + (idPermission != null ? idPermission.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
    }
}
