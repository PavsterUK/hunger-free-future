package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.domain.FoodBank;
import org.springframework.data.repository.CrudRepository;

public interface FoodBankRepository extends CrudRepository<FoodBank, Long> {
}
