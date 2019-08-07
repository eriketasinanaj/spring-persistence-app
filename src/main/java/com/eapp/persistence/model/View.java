package com.eapp.persistence.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class View {
    private Long viewId;
    private Long idModel;
    private String viewName;
    private String viewTemplate;
    private String viewConfiguration;

    @Id
    @Column(name = "view_id", nullable = false)
    public Long getViewId() {
        return viewId;
    }

    public void setViewId(Long viewId) {
        this.viewId = viewId;
    }

    @Basic
    @Column(name = "id_model", nullable = true)
    public Long getIdModel() {
        return idModel;
    }

    public void setIdModel(Long idModel) {
        this.idModel = idModel;
    }

    @Basic
    @Column(name = "view_name", nullable = true, length = 50)
    public String getViewName() {
        return viewName;
    }

    public void setViewName(String viewName) {
        this.viewName = viewName;
    }

    @Basic
    @Column(name = "view_template", nullable = true, length = 50)
    public String getViewTemplate() {
        return viewTemplate;
    }

    public void setViewTemplate(String viewTemplate) {
        this.viewTemplate = viewTemplate;
    }

    @Basic
    @Column(name = "view_configuration", nullable = true, length = -1)
    public String getViewConfiguration() {
        return viewConfiguration;
    }

    public void setViewConfiguration(String viewConfiguration) {
        this.viewConfiguration = viewConfiguration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        View view = (View) o;

        if (viewId != null ? !viewId.equals(view.viewId) : view.viewId != null) return false;
        if (idModel != null ? !idModel.equals(view.idModel) : view.idModel != null) return false;
        if (viewName != null ? !viewName.equals(view.viewName) : view.viewName != null) return false;
        if (viewTemplate != null ? !viewTemplate.equals(view.viewTemplate) : view.viewTemplate != null) return false;
        if (viewConfiguration != null ? !viewConfiguration.equals(view.viewConfiguration) : view.viewConfiguration != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = viewId != null ? viewId.hashCode() : 0;
        result = 31 * result + (idModel != null ? idModel.hashCode() : 0);
        result = 31 * result + (viewName != null ? viewName.hashCode() : 0);
        result = 31 * result + (viewTemplate != null ? viewTemplate.hashCode() : 0);
        result = 31 * result + (viewConfiguration != null ? viewConfiguration.hashCode() : 0);
        return result;
    }
}
