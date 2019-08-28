package com.nsa.charitystarter.controllers;


import com.nsa.charitystarter.DonationDTO.DonationDTO;
import com.nsa.charitystarter.Service.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DonationController {

    @Autowired
    DonationService donationService;

    @PostMapping("/donation")
    public ResponseEntity<String> postDonation(@RequestBody DonationDTO donationDTO)
    {return donationService.postDonation((donationDTO));}
}
