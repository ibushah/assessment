package com.nsa.charitystarter.Repository;

import com.nsa.charitystarter.model.CharityTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharityTotalRepository extends JpaRepository<CharityTotal,Long> {

}
