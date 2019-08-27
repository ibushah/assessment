package com.nsa.charitystarter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DonationsTemp {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ammountInPence;

    private Date donationDate;

    private Boolean hasNoBenefitToDonor;

    private Boolean wishesToGiftAid;

    private Long donorId;

    private Long sponserFormId;

    public DonationsTemp(Long ammountInPence, Date donationDate, Boolean hasNoBenefitToDonor, Boolean wishesToGiftAid, Long donorId, Long sponserFormId) {
        this.ammountInPence = ammountInPence;
        this.donationDate = donationDate;
        this.hasNoBenefitToDonor = hasNoBenefitToDonor;
        this.wishesToGiftAid = wishesToGiftAid;
        this.donorId = donorId;
        this.sponserFormId = sponserFormId;
    }


    public DonationsTemp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmmountInPence() {
        return ammountInPence;
    }

    public void setAmmountInPence(Long ammountInPence) {
        this.ammountInPence = ammountInPence;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public Boolean getHasNoBenefitToDonor() {
        return hasNoBenefitToDonor;
    }

    public void setHasNoBenefitToDonor(Boolean hasNoBenefitToDonor) {
        this.hasNoBenefitToDonor = hasNoBenefitToDonor;
    }

    public Boolean getWishesToGiftAid() {
        return wishesToGiftAid;
    }

    public void setWishesToGiftAid(Boolean wishesToGiftAid) {
        this.wishesToGiftAid = wishesToGiftAid;
    }

    public Long getDonorId() {
        return donorId;
    }

    public void setDonorId(Long donorId) {
        this.donorId = donorId;
    }

    public Long getSponserFormId() {
        return sponserFormId;
    }

    public void setSponserFormId(Long sponserFormId) {
        this.sponserFormId = sponserFormId;
    }
}
