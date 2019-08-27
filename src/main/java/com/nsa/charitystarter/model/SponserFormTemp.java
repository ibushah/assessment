package com.nsa.charitystarter.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SponserFormTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    String fundraiserName;

    Long charityId;

    String fundraiserAction;

    Date dateCreated;

    Date firstValidDate;

    Date lastValidDate;

    String furl;

    public SponserFormTemp(String fundraiserName, Long charityId, String fundraiserAction, Date dateCreated, Date firstValidDate, Date lastValidDate, String furl) {
        this.fundraiserName = fundraiserName;
        this.charityId = charityId;
        this.fundraiserAction = fundraiserAction;
        this.dateCreated = dateCreated;
        this.firstValidDate = firstValidDate;
        this.lastValidDate = lastValidDate;
        this.furl = furl;
    }

    public SponserFormTemp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFundraiserName() {
        return fundraiserName;
    }

    public void setFundraiserName(String fundraiserName) {
        this.fundraiserName = fundraiserName;
    }

    public Long getCharityId() {
        return charityId;
    }

    public void setCharityId(Long charityId) {
        this.charityId = charityId;
    }

    public String getFundraiserAction() {
        return fundraiserAction;
    }

    public void setFundraiserAction(String fundraiserAction) {
        this.fundraiserAction = fundraiserAction;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getFirstValidDate() {
        return firstValidDate;
    }

    public void setFirstValidDate(Date firstValidDate) {
        this.firstValidDate = firstValidDate;
    }

    public Date getLastValidDate() {
        return lastValidDate;
    }

    public void setLastValidDate(Date lastValidDate) {
        this.lastValidDate = lastValidDate;
    }

    public String getFurl() {
        return furl;
    }

    public void setFurl(String furl) {
        this.furl = furl;
    }
}
