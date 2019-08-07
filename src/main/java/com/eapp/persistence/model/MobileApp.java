package com.eapp.persistence.model;

import javax.persistence.*;

@Entity
@Table(name = "mobile_app", schema = "app_man", catalog = "")
public class MobileApp {
    private Long mobileAppId;
    private Long idApplication;
    private String appDomain;
    private String appBundle;
    private String appFcm;
    private String appIosCert;
    private String appIosPem;
    private String deviceUuid;

    @Id
    @Column(name = "mobile_app_id")
    public Long getMobileAppId() {
        return mobileAppId;
    }

    public void setMobileAppId(Long mobileAppId) {
        this.mobileAppId = mobileAppId;
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
    @Column(name = "app_domain")
    public String getAppDomain() {
        return appDomain;
    }

    public void setAppDomain(String appDomain) {
        this.appDomain = appDomain;
    }

    @Basic
    @Column(name = "app_bundle")
    public String getAppBundle() {
        return appBundle;
    }

    public void setAppBundle(String appBundle) {
        this.appBundle = appBundle;
    }

    @Basic
    @Column(name = "app_fcm")
    public String getAppFcm() {
        return appFcm;
    }

    public void setAppFcm(String appFcm) {
        this.appFcm = appFcm;
    }

    @Basic
    @Column(name = "app_ios_cert")
    public String getAppIosCert() {
        return appIosCert;
    }

    public void setAppIosCert(String appIosCert) {
        this.appIosCert = appIosCert;
    }

    @Basic
    @Column(name = "app_ios_pem")
    public String getAppIosPem() {
        return appIosPem;
    }

    public void setAppIosPem(String appIosPem) {
        this.appIosPem = appIosPem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MobileApp mobileApp = (MobileApp) o;

        if (mobileAppId != null ? !mobileAppId.equals(mobileApp.mobileAppId) : mobileApp.mobileAppId != null)
            return false;
        if (idApplication != null ? !idApplication.equals(mobileApp.idApplication) : mobileApp.idApplication != null)
            return false;
        if (appDomain != null ? !appDomain.equals(mobileApp.appDomain) : mobileApp.appDomain != null) return false;
        if (appBundle != null ? !appBundle.equals(mobileApp.appBundle) : mobileApp.appBundle != null) return false;
        if (appFcm != null ? !appFcm.equals(mobileApp.appFcm) : mobileApp.appFcm != null) return false;
        if (appIosCert != null ? !appIosCert.equals(mobileApp.appIosCert) : mobileApp.appIosCert != null) return false;
        if (appIosPem != null ? !appIosPem.equals(mobileApp.appIosPem) : mobileApp.appIosPem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mobileAppId != null ? mobileAppId.hashCode() : 0;
        result = 31 * result + (idApplication != null ? idApplication.hashCode() : 0);
        result = 31 * result + (appDomain != null ? appDomain.hashCode() : 0);
        result = 31 * result + (appBundle != null ? appBundle.hashCode() : 0);
        result = 31 * result + (appFcm != null ? appFcm.hashCode() : 0);
        result = 31 * result + (appIosCert != null ? appIosCert.hashCode() : 0);
        result = 31 * result + (appIosPem != null ? appIosPem.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "device_uuid", nullable = true, length = 255)
    public String getDeviceUuid() {
        return deviceUuid;
    }

    public void setDeviceUuid(String deviceUuid) {
        this.deviceUuid = deviceUuid;
    }
}
