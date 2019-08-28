package com.nsa.charitystarter.controllers;


import com.nsa.charitystarter.DonationDTO.DonationDTO;
import com.nsa.charitystarter.Service.DonationService;
import com.nsa.charitystarter.model.Charity;
import com.nsa.charitystarter.model.CharityTotal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DonationController {

    @Autowired
    DonationService donationService;

    @PostMapping("/donation")
    public ResponseEntity<String> postDonation(@RequestBody DonationDTO donationDTO)
    {return donationService.postDonation((donationDTO));}

    @GetMapping("/donation/getall")
    public List<CharityTotal> getAllCharity(){
        return donationService.getAllCharity();


    }
    @GetMapping("/donation/id/{id}")
    public Charity getById(@PathVariable ("id" ) Long id){

        return donationService.getCharityByid(id);


    }

    @GetMapping ("/donation/name/{name}")
    public Charity getByName(@PathVariable ("name") String name){

        return donationService.getCharityByName(name);

    }


}
