package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.math.BigDecimal;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_CAR")
@Entity(name = "davaleba_Car")
public class Car extends StandardEntity {
    private static final long serialVersionUID = -2472896009759563408L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_MANUFACTURERS_ID")
    protected CarManufacturers carManufacturers;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_MODEL_ID")
    protected CarModel carModel;

    @OneToMany(mappedBy = "car")
    protected List<Characteristics> characteristics;

    @Column(name = "NAME")
    protected String name;

    @Pattern(message = "{msg://davaleba_Car.yearOfIssue.validation.Pattern}", regexp = "####")
    @Length(message = "{msg://davaleba_Car.yearOfIssue.validation.Length}", min = 4, max = 4)
    @Column(name = "YEAR_OF_ISSUE")
    protected String yearOfIssue;

    @Column(name = "CAR_COST")
    protected BigDecimal carCost;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "APPLICATION_FOR_THE_PURCHASE_OF_A_CAR_ID")
    protected ApplicationForThePurchaseOfACar applicationForThePurchaseOfACar;

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarManufacturers(CarManufacturers carManufacturers) {
        this.carManufacturers = carManufacturers;
    }

    public CarManufacturers getCarManufacturers() {
        return carManufacturers;
    }

    public void setCarCost(BigDecimal carCost) {
        this.carCost = carCost;
    }

    public BigDecimal getCarCost() {
        return carCost;
    }

    public List<Characteristics> getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(List<Characteristics> characteristics) {
        this.characteristics = characteristics;
    }

    public ApplicationForThePurchaseOfACar getApplicationForThePurchaseOfACar() {
        return applicationForThePurchaseOfACar;
    }

    public void setApplicationForThePurchaseOfACar(ApplicationForThePurchaseOfACar applicationForThePurchaseOfACar) {
        this.applicationForThePurchaseOfACar = applicationForThePurchaseOfACar;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getName() {
        return name;
    }

}