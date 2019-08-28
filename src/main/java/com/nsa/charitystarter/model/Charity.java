package com.nsa.charitystarter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.List;

@Entity
public class Charity {

    @Id
    private Long id;


    private Long registrationId;

    private String name;

    private String purpose;

    private String logoFileName;

    private String acronym;

    private Boolean isActive;

    @OneToMany(mappedBy = "charity")
    private List<CharityTotal> charityTotalList;

    @OneToMany(mappedBy = "charity")
    private List<GiftAidDonation> giftAidDonations;

    public Charity() {
    }

    public Charity(Long registrationId, String name, String purpose, String logoFileName, String acronym, Boolean isActive, List<CharityTotal> charityTotal) {
        this.registrationId = registrationId;
        this.name = name;
        this.purpose = purpose;
        this.logoFileName = logoFileName;
        this.acronym = acronym;
        this.isActive = isActive;
        this.charityTotalList = charityTotal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CharityTotal> getCharityTotal() {
        return charityTotalList;
    }

    public void setCharityTotal(List<CharityTotal> charityTotal) {
        this.charityTotalList = charityTotal;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getLogoFileName() {
        return logoFileName;
    }

    public void setLogoFileName(String logoFileName) {
        this.logoFileName = logoFileName;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
