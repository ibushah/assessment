package com.nsa.charitystarter.Repository;

import com.nsa.charitystarter.model.GiftAidDonation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftAidDonationRepository extends JpaRepository<GiftAidDonation,Long> {
}
