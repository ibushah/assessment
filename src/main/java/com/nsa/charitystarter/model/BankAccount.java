package com.nsa.charitystarter.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long charityId;

    private Long accountNumber;

    private Long sortCode;

    private Date lastValidDate;

    public BankAccount(Long charityId, Long accountNumber, Long sortCode, Date lastValidDate) {
        this.charityId = charityId;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.lastValidDate = lastValidDate;
    }

    public BankAccount() {
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

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
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
