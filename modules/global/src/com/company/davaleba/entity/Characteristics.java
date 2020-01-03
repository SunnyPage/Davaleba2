package com.company.davaleba.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "DAVALEBA_CHARACTERISTICS")
@Entity(name = "davaleba_Characteristics")
public class Characteristics extends StandardEntity {
    private static final long serialVersionUID = -4312311105643891712L;

    @Column(name = "NAME")
    protected String name;

    @Column(name = "PRICE")
    protected String price;

    @Column(name = "TYPE_OF_CAR")
    protected String typeOfCar;

    @Column(name = "NOTE")
    protected String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_MODEL_ID")
    protected CarModel carModel;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAR_ID")
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public TypeOfCar getTypeOfCar() {
        return typeOfCar == null ? null : TypeOfCar.fromId(typeOfCar);
    }

    public void setTypeOfCar(TypeOfCar typeOfCar) {
        this.typeOfCar = typeOfCar == null ? null : typeOfCar.getId();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}