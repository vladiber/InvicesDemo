package io.plainid.invicesdemo.repository;

import io.plainid.invicesdemo.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
