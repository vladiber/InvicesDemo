package io.plainid.invicesdemo.repository;

import io.plainid.invicesdemo.model.Invoice;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;



public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    @Override
    @Transactional
    @Query(value = "select i.* from Invoice i left join Invoices a on a.id = i.id",nativeQuery = true)
    List<Invoice> findAll();

    @Override
    @Transactional
    @Query(value = "select i.* from Invoice i left join Invoices a on a.id = i.id where a.id = ?",nativeQuery = true)

    Optional<Invoice> findById(Long aLong);
}
