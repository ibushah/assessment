package com.nsa.charitystarter.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String buildingName;

    Long buildingNumber;

    String street;

    String district;

    String city;

    String postalCode;

    String CountryIsoCode;

    public Address( String buildingName, Long buildingNumber, String street, String district, String city, String postalCode, String countryIsoCode) {
        this.buildingName = buildingName;
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.district = district;
        this.city = city;
        this.postalCode = postalCode;
        CountryIsoCode = countryIsoCode;
    }

    public Address() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Long getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(Long buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryIsoCode() {
        return CountryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        CountryIsoCode = countryIsoCode;
    }
}
