package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.jsonparsing.pojos.FoodBankPOJO;
import org.springframework.data.repository.CrudRepository;

public interface FoodBankRepository extends CrudRepository<FoodBankPOJO, Long> {
}
