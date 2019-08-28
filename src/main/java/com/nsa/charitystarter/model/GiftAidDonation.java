package com.nsa.charitystarter.model;


import com.fasterxml.jackson.annotation.JsonBackReference;

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




    private Double ammountInPence;

    private Date donationDate;

    private Boolean hasNoBenefitToDonor;

    private Boolean wishesToGiftAid;

    private Boolean ownMoney;

    @ManyToOne
    @JoinColumn(name = "charity_id", nullable = false)
    @JsonBackReference
    private Charity charity;


    @ManyToOne
    @JoinColumn(name = "donation_id", nullable = false)
    @JsonBackReference
    private Donation donation;

    @ManyToOne
    @JoinColumn(name = "donor_id", nullable = false)
    @JsonBackReference
    private Donor donor;

    private Long sponserFormId;



    private String paymentReference;

    private Double giftAidAmmount;

    public GiftAidDonation() {
    }

    public GiftAidDonation(Double ammountInPence, Date donationDate, Boolean hasNoBenefitToDonor, Boolean wishesToGiftAid, Boolean ownMoney, Charity charity, Donation donation, Donor donor, Long sponserFormId, String paymentReference, Double giftAidAmmount) {
        this.ammountInPence = ammountInPence;
        this.donationDate = donationDate;
        this.hasNoBenefitToDonor = hasNoBenefitToDonor;
        this.wishesToGiftAid = wishesToGiftAid;
        this.ownMoney = ownMoney;
        this.charity = charity;
        this.donation = donation;
        this.donor = donor;
        this.sponserFormId = sponserFormId;
        this.paymentReference = paymentReference;
        this.giftAidAmmount = giftAidAmmount;
    }

    public Charity getCharity() {
        return charity;
    }

    public void setCharity(Charity charity) {
        this.charity = charity;
    }

    public Donation getDonation() {
        return donation;
    }

    public Boolean getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(Boolean ownMoney) {
        this.ownMoney = ownMoney;
    }

    public void setDonation(Donation donation) {
        this.donation = donation;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Double getAmmountInPence() {
        return ammountInPence;
    }

    public void setAmmountInPence(Double ammountInPence) {
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

    public Charity getDonorId() {
        return charity;
    }

    public void setDonorId(Charity charity) {
        this.charity = charity;
    }

    public Long getSponserFormId() {
        return sponserFormId;
    }

    public void setSponserFormId(Long sponserFormId) {
        this.sponserFormId = sponserFormId;
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
