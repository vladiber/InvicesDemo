package io.plainid.invicesdemo.repository;

import io.plainid.invicesdemo.model.Invoice;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
//    @Query("select i from Invoice i left join Account a on a.InvoiceId = i.id")
//    List<Invoice> findByPlainId();
//
    @Override
    @Query("select i from Invoice i left join Invoices a on a.InvoiceId = i.id")
    List<Invoice> findAll();
}
