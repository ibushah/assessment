package com.nsa.charitystarter.Repository;

import com.nsa.charitystarter.model.GiftAidRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftAidRateRepository extends JpaRepository<GiftAidRate,Long> {
}
