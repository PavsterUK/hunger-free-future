package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.FoodBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodBankRepository extends JpaRepository<FoodBank, String> {
}
