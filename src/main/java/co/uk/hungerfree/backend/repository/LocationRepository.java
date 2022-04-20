package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.location.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface LocationRepository extends JpaRepository<Location, Long> {

    @Query(value = "SELECT lc.location_food_bank AS parent_fb_slug, lc.slug, lc.address, lc.email, lc.lat_lng, lc.name, lc.phone, need.needs FROM location lc\n" +
            "LEFT JOIN need\n" +
            "ON need.slug = lc.slug\n" +
            "WHERE location_food_bank LIKE '%salvation%'", nativeQuery = true)
    List<Map<String, String>> findAllSalvationArmyWithNeeds();
}
