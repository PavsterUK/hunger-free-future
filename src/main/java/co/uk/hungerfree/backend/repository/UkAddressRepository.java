package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.UkAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UkAddressRepository extends JpaRepository<UkAddress, Long> {
}
