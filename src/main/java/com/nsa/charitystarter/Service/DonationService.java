package com.nsa.charitystarter.Service;

import com.nsa.charitystarter.model.Donation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DonationService {

    public ResponseEntity<String> postDonation(Donation donation)
    {
        return new ResponseEntity<>("\"Donation Posted Successfully\"", HttpStatus.OK);
    }
}
