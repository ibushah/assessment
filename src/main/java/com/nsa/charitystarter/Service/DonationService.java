package com.nsa.charitystarter.Service;

import com.nsa.charitystarter.DonationDTO.DonationDTO;
import com.nsa.charitystarter.Repository.*;
import com.nsa.charitystarter.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class DonationService {

    private static DecimalFormat df = new DecimalFormat("0.00");


    @Autowired
    CharityRepository charityRepository;

    @Autowired
    CharityTotalRepository charityTotalRepository;

    @Autowired
    GiftAidRateRepository giftAidRateRepository;

    @Autowired
    AddressRepository addressRepository;

    @Autowired
    DonorRepository donorRepository;

    @Autowired
    DonationRepository donationRepository;

    @Autowired
    GiftAidDonationRepository giftAidDonationRepository;

    public ResponseEntity<String> postDonation(DonationDTO donationDTO)
    {
       Optional<Charity> charity= charityRepository.findById(donationDTO.getCharityId());

        List<Charity> charityList=charityRepository.findAll();

        if(charityList.isEmpty())
        {
            GiftAidRate giftAidRate=new GiftAidRate();
            giftAidRate.setStartDate(new Date());
            giftAidRate.setRatePercentage(33d);
            giftAidRateRepository.save(giftAidRate);
        }

        if(!charity.isPresent())
        {
            Charity charity1=new Charity();

            charity1.setId(donationDTO.getCharityId());
            charity1.setLogoFileName(donationDTO.getLogoFileName());
            charity1.setName(donationDTO.getCharityName());
            charity1.setPurpose(donationDTO.getPurpose());
            charity1.setRegistrationId(donationDTO.getRegistrationId());
            Charity charity2=saveCharity(charity1);

            CharityTotal charityTotal=new CharityTotal();

            charityTotal.setCharity(charity1);
            charityTotal.setTotalBeforeGiftAid(donationDTO.getAmount());
            Double afterGiftAid= ((float) 33/100)*donationDTO.getAmount();
            charityTotal.setTotalGiftAid(afterGiftAid);
            charityTotal.setTotalAfterGiftAid(afterGiftAid+donationDTO.getAmount());
            charityTotal.setLastUpdatedDate(new Date());
           charityTotalRepository.save(charityTotal);

            Address address=new Address();

            address.setBuildingName(donationDTO.getBuildingName());
            address.setBuildingNumber(donationDTO.getBuildingNumber());
            address.setPostalCode(donationDTO.getDonorPostalCode());
            address.setCity(donationDTO.getDonorCity());
             address.setStreet(donationDTO.getStreet());
             address.setCountry(donationDTO.getCountry());
           address.setPostalCode(donationDTO.getDonorPostalCode());
            Address address1= saveAddress(address);

           Donor donor=new Donor();

           donor.setFirstName(donationDTO.getDonorFirstName());
           donor.setLastName(donationDTO.getDonorLastName());
           donor.setAddressId(address1.getId());
          Donor donor1= saveDonor(donor);

            Donation donation=new Donation();
            donation.setDonationDate(new Date());
            donation.setAmmountInPence(donationDTO.getAmount());
            donation.setDonorId(donor1.getId());
            donation.setHasNoBenefitToDonor(donationDTO.getHasNoBenefitToDonor());
            donation.setOwnMoney(donationDTO.getOwnMoney());
            donation.setWishesToGiftAid(donationDTO.getWishesToGiftAid());

            Donation donation1=  saveDonation(donation);

            GiftAidDonation giftAidDonation=new GiftAidDonation();

            giftAidDonation.setAmmountInPence(donationDTO.getAmount());
            giftAidDonation.setCharity(charity2);
            giftAidDonation.setDonation(donation1);
            giftAidDonation.setDonationDate(new Date());
            giftAidDonation.setHasNoBenefitToDonor(donationDTO.getHasNoBenefitToDonor());
            giftAidDonation.setWishesToGiftAid(donationDTO.getWishesToGiftAid());
            giftAidDonation.setOwnMoney(donationDTO.getOwnMoney());
            giftAidDonation.setDonor(donor1);

            giftAidDonationRepository.save(giftAidDonation);
        }
        else
        {
        Charity charity2=charity.get();

            CharityTotal charityTotal=new CharityTotal();

            charityTotal.setCharity(charity2);
            charityTotal.setTotalBeforeGiftAid(donationDTO.getAmount());
            Double afterGiftAid= ((float) 33/100)*donationDTO.getAmount();
            charityTotal.setTotalGiftAid(afterGiftAid);
            charityTotal.setTotalAfterGiftAid(afterGiftAid+donationDTO.getAmount());
            charityTotal.setLastUpdatedDate(new Date());
            charityTotalRepository.save(charityTotal);

            Address address=new Address();

            address.setBuildingName(donationDTO.getBuildingName());
            address.setBuildingNumber(donationDTO.getBuildingNumber());
            address.setPostalCode(donationDTO.getDonorPostalCode());
            address.setCity(donationDTO.getDonorCity());
            address.setStreet(donationDTO.getStreet());
            address.setCountry(donationDTO.getCountry());
            address.setPostalCode(donationDTO.getDonorPostalCode());
            Address address1= saveAddress(address);

            Donor donor=new Donor();

            donor.setFirstName(donationDTO.getDonorFirstName());
            donor.setLastName(donationDTO.getDonorLastName());
            donor.setAddressId(address1.getId());
            Donor donor1=saveDonor(donor);

            Donation donation=new Donation();
            donation.setDonationDate(new Date());
            donation.setAmmountInPence(donationDTO.getAmount());
            donation.setDonorId(donor1.getId());
            donation.setHasNoBenefitToDonor(donationDTO.getHasNoBenefitToDonor());
            donation.setOwnMoney(donationDTO.getOwnMoney());
            donation.setWishesToGiftAid(donationDTO.getWishesToGiftAid());

          Donation donation1=  saveDonation(donation);

            GiftAidDonation giftAidDonation=new GiftAidDonation();

            giftAidDonation.setAmmountInPence(donationDTO.getAmount());
            giftAidDonation.setCharity(charity2);
            giftAidDonation.setDonation(donation1);
            giftAidDonation.setDonationDate(new Date());
            giftAidDonation.setHasNoBenefitToDonor(donationDTO.getHasNoBenefitToDonor());
            giftAidDonation.setWishesToGiftAid(donationDTO.getWishesToGiftAid());
            giftAidDonation.setOwnMoney(donationDTO.getOwnMoney());
            giftAidDonation.setDonor(donor1);

            giftAidDonationRepository.save(giftAidDonation);

        }

        return new ResponseEntity<>("\"Donation Posted Successfully\"", HttpStatus.OK);
    }


    public  Address saveAddress(Address address)
    {

        addressRepository.save(address);

        return address;
    }

    public  Donor saveDonor(Donor donor)
    {

        donorRepository.save(donor);

        return donor;
    }

    public  Charity saveCharity(Charity charity)
    {
        charityRepository.save(charity);

        return  charity;
    }

    public Donation saveDonation(Donation donation)
    {
        donationRepository.save(donation);

        return  donation;
    }
}
