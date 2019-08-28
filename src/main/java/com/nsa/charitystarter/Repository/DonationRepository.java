package com.nsa.charitystarter.Repository;

import com.nsa.charitystarter.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationRepository extends JpaRepository<Donation,Long> {
}
