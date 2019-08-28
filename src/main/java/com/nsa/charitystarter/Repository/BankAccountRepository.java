package com.nsa.charitystarter.Repository;

import com.nsa.charitystarter.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,Long> {
}
