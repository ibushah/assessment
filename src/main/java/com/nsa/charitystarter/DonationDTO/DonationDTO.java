package com.nsa.charitystarter.DonationDTO;

public class DonationDTO {


    Long id;

    String donorFirstName;

    String donorLastName;

    String donorAddress;

    String donorCity;

    String donorPostalCode;

    String donorCountry;

    Boolean hasNoBenefitToDonor;

    Boolean isOwnMoney;

    Boolean wishesToGiftAid;

    Long amount;

    String charityName;

    String acronym;

    Boolean isActive;

    String logoFileName;

    String purpose;

    Long registrationId;

    Long charityId;


    public DonationDTO(Long id, String donorFirstName, String donorLastName, String donorAddress, String donorCity, String donorPostalCode, String donorCountry, Boolean hasNoBenefitToDonor, Boolean isOwnMoney, Boolean wishesToGiftAid, Long amount, String charityName, String acronym, Boolean isActive, String logoFileName, String purpose, Long registrationId, Long charityId) {
        this.id = id;
        this.donorFirstName = donorFirstName;
        this.donorLastName = donorLastName;
        this.donorAddress = donorAddress;
        this.donorCity = donorCity;
        this.donorPostalCode = donorPostalCode;
        this.donorCountry = donorCountry;
        this.hasNoBenefitToDonor = hasNoBenefitToDonor;
        this.isOwnMoney = isOwnMoney;
        this.wishesToGiftAid = wishesToGiftAid;
        this.amount = amount;
        this.charityName = charityName;
        this.acronym = acronym;
        this.isActive = isActive;
        this.logoFileName = logoFileName;
        this.purpose = purpose;
        this.registrationId = registrationId;
        this.charityId = charityId;
    }

    public DonationDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLogoFileName() {
        return logoFileName;
    }

    public void setLogoFileName(String logoFileName) {
        this.logoFileName = logoFileName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Long getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(Long registrationId) {
        this.registrationId = registrationId;
    }

    public Long getCharityId() {
        return charityId;
    }

    public void setCharityId(Long charityId) {
        this.charityId = charityId;
    }

    public String getDonorFirstName() {
        return donorFirstName;
    }

    public void setDonorFirstName(String donorFirstName) {
        this.donorFirstName = donorFirstName;
    }

    public String getDonorLastName() {
        return donorLastName;
    }

    public void setDonorLastName(String donorLastName) {
        this.donorLastName = donorLastName;
    }

    public String getDonorAddress() {
        return donorAddress;
    }

    public void setDonorAddress(String donorAddress) {
        this.donorAddress = donorAddress;
    }

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public String getDonorPostalCode() {
        return donorPostalCode;
    }

    public void setDonorPostalCode(String donorPostalCode) {
        this.donorPostalCode = donorPostalCode;
    }

    public String getDonorCountry() {
        return donorCountry;
    }

    public void setDonorCountry(String donorCountry) {
        this.donorCountry = donorCountry;
    }

    public Boolean getHasNoBenefitToDonor() {
        return hasNoBenefitToDonor;
    }

    public void setHasNoBenefitToDonor(Boolean hasNoBenefitToDonor) {
        this.hasNoBenefitToDonor = hasNoBenefitToDonor;
    }

    public Boolean getOwnMoney() {
        return isOwnMoney;
    }

    public void setOwnMoney(Boolean ownMoney) {
        isOwnMoney = ownMoney;
    }

    public Boolean getWishesToGiftAid() {
        return wishesToGiftAid;
    }

    public void setWishesToGiftAid(Boolean wishesToGiftAid) {
        this.wishesToGiftAid = wishesToGiftAid;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getCharityName() {
        return charityName;
    }

    public void setCharityName(String charityName) {
        this.charityName = charityName;
    }
}
