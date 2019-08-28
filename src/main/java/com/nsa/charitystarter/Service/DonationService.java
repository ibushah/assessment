package com.nsa.charitystarter.Service;

import com.nsa.charitystarter.DonationDTO.DonationDTO;
import com.nsa.charitystarter.Repository.CharityRepository;
import com.nsa.charitystarter.model.Charity;
import com.nsa.charitystarter.model.Donation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.Optional;

@Service
public class DonationService {

    @Autowired
    CharityRepository charityRepository;


    public ResponseEntity<String> postDonation(DonationDTO donationDTO)
    {
       Optional<Charity> charity= charityRepository.findById(donationDTO.getId());



        if(!charity.isPresent())
        {
            Charity charity1=new Charity();

            charity1.setId(donationDTO.getCharityId());
            charity1.setLogoFileName(donationDTO.getLogoFileName());

        }

        return new ResponseEntity<>("\"Donation Posted Successfully\"", HttpStatus.OK);
    }
}
