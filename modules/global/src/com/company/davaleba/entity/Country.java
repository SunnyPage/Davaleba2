package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_COUNTRY")
@Entity(name = "davaleba_Country")
public class Country extends StandardEntity {
    private static final long serialVersionUID = -6551375401393798256L;

    @Column(name = "NAME")
    protected String name;

    @OnDelete(DeletePolicy.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    @Column(name = "CODE")
    protected String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_MANUFACTURERS_ID")
    protected CarManufacturers carManufacturers;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "country")
    protected ExtUser extUser;

    public ExtUser getExtUser() {
        return extUser;
    }

    public void setExtUser(ExtUser extUser) {
        this.extUser = extUser;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CarManufacturers getCarManufacturers() {
        return carManufacturers;
    }

    public void setCarManufacturers(CarManufacturers carManufacturers) {
        this.carManufacturers = carManufacturers;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}