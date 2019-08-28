package com.nsa.charitystarter.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CharityTotal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;




    private Long totalBeforeGiftAid;

    private Double totalGiftAid;

    private Double totalAfterGifAid;




    private Date lastUpdatedDate;

    @ManyToOne
    @JoinColumn(name = "charity_id", nullable = false)
    @JsonBackReference
    private Charity charity;



    public CharityTotal() {
    }

    public CharityTotal(Long totalBeforeGiftAid, Double totalGiftAid, Double totalAfterGifAid, Date lastUpdatedDate, Charity charity) {
        this.totalBeforeGiftAid = totalBeforeGiftAid;
        this.totalGiftAid = totalGiftAid;
        this.totalAfterGifAid = totalAfterGifAid;
        this.lastUpdatedDate = lastUpdatedDate;
        this.charity = charity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTotalBeforeGiftAid() {
        return totalBeforeGiftAid;
    }

    public void setTotalBeforeGiftAid(Long totalBeforeGiftAid) {
        this.totalBeforeGiftAid = totalBeforeGiftAid;
    }

    public Double getTotalGiftAid() {
        return totalGiftAid;
    }

    public void setTotalGiftAid(Double totalGiftAid) {
        this.totalGiftAid = totalGiftAid;
    }

    public Double getTotalAfterGifAid() {
        return totalAfterGifAid;
    }

    public void setTotalAfterGifAid(Double totalAfterGifAid) {
        this.totalAfterGifAid = totalAfterGifAid;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }
}
