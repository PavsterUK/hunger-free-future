package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.location.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface LocationRepository extends JpaRepository<Location, Long> {

    @Query(value = "SELECT l.id, l.address, l.email, parent_slug, l.slug, l.latitude, l.longitude, l.name, l.phone, food_bank.name as part_of, food_bank.homepage FROM location l\n" +
            "LEFT OUTER JOIN food_bank\n" +
            "ON food_bank.slug = l.parent_slug\n" +

            "WHERE (CASE WHEN :swLat < :neLat\n" +
            "        THEN l.latitude BETWEEN :swLat AND :neLat\n" +
            "        ELSE l.latitude BETWEEN :neLat AND :swLat\n" +
            "END) \n" +
            "AND\n" +
            "(CASE WHEN :swLng < :neLng\n" +
            "        THEN l.longitude BETWEEN :swLng AND :neLng\n" +
            "        ELSE l.longitude BETWEEN :neLng AND :swLng\n" +
            "END)", nativeQuery = true)
    List<Map<String, String>> withinBounds(@Param("swLat")Double swLat,
                                                         @Param("swLng")Double swLng,
                                                         @Param("neLat")Double neLat,
                                                         @Param("neLng")Double neLng);
}
