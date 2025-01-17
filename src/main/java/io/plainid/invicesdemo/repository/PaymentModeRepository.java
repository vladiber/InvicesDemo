package io.plainid.invicesdemo.repository;

import io.plainid.invicesdemo.model.PaymentMode;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;


public interface PaymentModeRepository extends JpaRepository<PaymentMode, Long> {
}
