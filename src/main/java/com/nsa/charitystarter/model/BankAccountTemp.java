package com.nsa.charitystarter.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BankAccountTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long charityId;


    private Long accountNo;


    private Long sortCode;

    private Date lastValidDate;


    public BankAccountTemp(Long charityId, Long accountNo, Long sortCode, Date lastValidDate) {
        this.charityId = charityId;
        this.accountNo = accountNo;
        this.sortCode = sortCode;
        this.lastValidDate = lastValidDate;
    }

    public BankAccountTemp() {
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public Long getSortCode() {
        return sortCode;
    }

    public void setSortCode(Long sortCode) {
        this.sortCode = sortCode;
    }

    public Date getLastValidDate() {
        return lastValidDate;
    }

    public void setLastValidDate(Date lastValidDate) {
        this.lastValidDate = lastValidDate;
    }
}
