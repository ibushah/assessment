package com.nsa.charitystarter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String firstName;

    String lastName;

    Long addressId;

    @OneToMany(mappedBy = "donor")
    List<GiftAidDonation> giftAidDonationList;

    public Donor(String firstName, String lastName, Long addressId, List<GiftAidDonation> giftAidDonationList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addressId = addressId;
        this.giftAidDonationList = giftAidDonationList;
    }

    public Donor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<GiftAidDonation> getGiftAidDonationList() {
        return giftAidDonationList;
    }

    public void setGiftAidDonationList(List<GiftAidDonation> giftAidDonationList) {
        this.giftAidDonationList = giftAidDonationList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}
