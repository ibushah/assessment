package com.nsa.charitystarter.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class GiftAidRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Double ratePercentage;

    Date startDate;

    Date endDate;

    public GiftAidRate(Double ratePercentage, Date startDate, Date endDate) {
        this.ratePercentage = ratePercentage;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public GiftAidRate() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRatePercentage() {
        return ratePercentage;
    }

    public void setRatePercentage(Double ratePercentage) {
        this.ratePercentage = ratePercentage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
