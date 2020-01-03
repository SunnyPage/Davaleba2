package com.company.davaleba.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "DAVALEBA_APPLICATION_FOR_THE_PURCHASE_OF_A_CAR")
@Entity(name = "davaleba_ApplicationForThePurchaseOfACar")
public class ApplicationForThePurchaseOfACar extends StandardEntity {
    private static final long serialVersionUID = 6756172202595475212L;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(DeletePolicy.CASCADE)
    @JoinColumn(name = "CAR_ID")
    protected Car car;

    @Column(name = "CAR_PAID")
    protected Boolean carPaid;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MANAGER_ID")
    protected User manager;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTERPARTY_ID")
    protected Counterparty counterparty;

    public void setCounterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
    }

    public Counterparty getCounterparty() {
        return counterparty;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getCarPaid() {
        return carPaid;
    }

    public void setCarPaid(Boolean carPaid) {
        this.carPaid = carPaid;
    }

}