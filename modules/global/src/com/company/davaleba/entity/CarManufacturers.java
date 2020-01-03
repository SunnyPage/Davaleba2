package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_CAR_MANUFACTURING")
@Entity(name = "davaleba_CarManufacturing")
public class CarManufacturers extends StandardEntity {
    private static final long serialVersionUID = -6430736293532972380L;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @NotNull
    @Column(name = "MANUFACTURER_CODE", nullable = false, unique = true)
    protected String manufacturerCode;

    @OneToMany(mappedBy = "carManufacturers")
    protected List<Country> country;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MODEL_ID")
    protected CarModel model;

    @OneToMany(mappedBy = "carManufacturers")
    protected List<Car> car;

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public List<Car> getCar() {
        return car;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}