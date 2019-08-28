package com.nsa.charitystarter.Repository;

import com.nsa.charitystarter.model.Charity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CharityRepository extends JpaRepository<Charity,Long> {
}
