package com.nsa.charitystarter.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class GiftAidDonation {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    private Long donationId;

    private Long ammountInPence;

    private Date donationDate;

    private Boolean hasNoBenefitToDonor;

    private Boolean wishesToGiftAid;

    private Long donorId;

    private Long sponserFormId;

    private Long charityId;

    private String paymentReference;

    private Double giftAidAmmount;

    public GiftAidDonation() {
    }

    public GiftAidDonation(Long donationId, Long ammountInPence, Date donationDate, Boolean hasNoBenefitToDonor, Boolean wishesToGiftAid, Long donorId, Long sponserFormId, Long charityId, String paymentReference, Double giftAidAmmount) {
        this.donationId = donationId;
        this.ammountInPence = ammountInPence;
        this.donationDate = donationDate;
        this.hasNoBenefitToDonor = hasNoBenefitToDonor;
        this.wishesToGiftAid = wishesToGiftAid;
        this.donorId = donorId;
        this.sponserFormId = sponserFormId;
        this.charityId = charityId;
        this.paymentReference = paymentReference;
        this.giftAidAmmount = giftAidAmmount;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDonationId() {
        return donationId;
    }

    public void setDonationId(Long donationId) {
        this.donationId = donationId;
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

    public Long getCharityId() {
        return charityId;
    }

    public void setCharityId(Long charityId) {
        this.charityId = charityId;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public Double getGiftAidAmmount() {
        return giftAidAmmount;
    }

    public void setGiftAidAmmount(Double giftAidAmmount) {
        this.giftAidAmmount = giftAidAmmount;
    }
}
