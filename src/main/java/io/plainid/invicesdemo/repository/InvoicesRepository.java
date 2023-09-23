package io.plainid.invicesdemo.repository;

import io.plainid.invicesdemo.model.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoicesRepository extends JpaRepository<Invoices, Long> {
}
