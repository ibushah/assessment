package com.nsa.charitystarter.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftAidRateRepository extends JpaRepository<GiftAidRateRepository,Long> {
}
