package com.nsa.charitystarter.model;


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


    private Long charityId;

    private Long totalBeforeGiftAid;

    private Long totalGiftAid;

    private Date lastUpdatedDate;

    public CharityTotal(Long charityId, Long totalBeforeGiftAid, Long totalGiftAid, Date lastUpdatedDate) {
        this.charityId = charityId;
        this.totalBeforeGiftAid = totalBeforeGiftAid;
        this.totalGiftAid = totalGiftAid;
        this.lastUpdatedDate = lastUpdatedDate;
    }

    public CharityTotal() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCharityId() {
        return charityId;
    }

    public void setCharityId(Long charityId) {
        this.charityId = charityId;
    }

    public Long getTotalBeforeGiftAid() {
        return totalBeforeGiftAid;
    }

    public void setTotalBeforeGiftAid(Long totalBeforeGiftAid) {
        this.totalBeforeGiftAid = totalBeforeGiftAid;
    }

    public Long getTotalGiftAid() {
        return totalGiftAid;
    }

    public void setTotalGiftAid(Long totalGiftAid) {
        this.totalGiftAid = totalGiftAid;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
}
