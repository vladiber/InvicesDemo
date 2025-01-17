package io.plainid.invicesdemo.repository;

import io.plainid.invicesdemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}