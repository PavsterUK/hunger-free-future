package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.foodbank.FoodBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface FoodBankRepository extends JpaRepository<FoodBank, Long> {

    @Query(value =
                    "SELECT fb.id, fb.address, fb.email, fb.slug, fb.latitude, fb.longitude, fb.name, fb.phone, need.needs FROM food_bank fb\n" +
                    "LEFT OUTER JOIN need\n" +
                    "ON need.slug = fb.slug\n" +
                    "WHERE (CASE WHEN :swLat < :neLat\n" +
                    "        THEN latitude BETWEEN :swLat AND :neLat\n" +
                    "        ELSE latitude BETWEEN :neLat AND :swLat\n" +
                    "END) \n" +
                    "AND\n" +
                    "(CASE WHEN :swLng < :neLng\n" +
                    "        THEN longitude BETWEEN :swLng AND :neLng\n" +
                    "        ELSE longitude BETWEEN :neLng AND :swLng\n" +
                    "END)", nativeQuery = true)
    List<Map<String, String>> withinBounds(@Param("swLat")Double swLat,
                                           @Param("swLng")Double swLng,
                                           @Param("neLat")Double neLat,
                                           @Param("neLng")Double neLng);

}
