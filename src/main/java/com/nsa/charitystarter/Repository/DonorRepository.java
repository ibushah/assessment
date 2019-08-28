package com.nsa.charitystarter.Repository;

import com.nsa.charitystarter.model.Donor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonorRepository extends JpaRepository<Donor,Long> {
}
