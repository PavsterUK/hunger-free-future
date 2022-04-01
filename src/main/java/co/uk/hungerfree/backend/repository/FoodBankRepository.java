package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.foodbank.entity.FoodBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public interface FoodBankRepository extends JpaRepository<FoodBank, String> {

    @Query(value = "select location.address ,location.name, food_bank.slug , need.needs \n" +
            "from food_bank\n" +
            "inner join location on location.location_food_bank = food_bank.slug \n" +
            "inner join need on need.slug = location.slug", nativeQuery = true)
    List<Map<String, String>> test();

    @Query(value = "select fb.slug, fb.address, fb.email, fb.lat_lng, fb.name, fb.phone, fb.homepage, need.needs\n" +
            "from food_bank fb\n" +
            "left join need\n" +
            "on fb.slug = need.slug\n" +
            "group by fb.slug", nativeQuery = true)
    List<Map<String, String>> allFbInclNeeds();
}
