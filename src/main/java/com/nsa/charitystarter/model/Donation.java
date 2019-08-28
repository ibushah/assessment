package com.nsa.charitystarter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Donation {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Double ammountInPence;

    private Date donationDate;

    private Boolean ownMoney;

    private Boolean hasNoBenefitToDonor;

    private Boolean wishesToGiftAid;

    private Long donorId;

    private Long sponserFormId;

    @OneToMany(mappedBy = "donor")
    List<GiftAidDonation> giftAidDonationList;



    public Donation() {
    }

    public Donation(Double ammountInPence, Date donationDate, Boolean ownMoney, Boolean hasNoBenefitToDonor, Boolean wishesToGiftAid, Long donorId, Long sponserFormId, List<GiftAidDonation> giftAidDonationList) {
        this.ammountInPence = ammountInPence;
        this.donationDate = donationDate;
        this.ownMoney = ownMoney;
        this.hasNoBenefitToDonor = hasNoBenefitToDonor;
        this.wishesToGiftAid = wishesToGiftAid;
        this.donorId = donorId;
        this.sponserFormId = sponserFormId;
        this.giftAidDonationList = giftAidDonationList;
    }

    public List<GiftAidDonation> getGiftAidDonationList() {
        return giftAidDonationList;
    }

    public void setGiftAidDonationList(List<GiftAidDonation> giftAidDonationList) {
        this.giftAidDonationList = giftAidDonationList;
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

    public Boolean getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(Boolean ownMoney) {
        this.ownMoney = ownMoney;
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
