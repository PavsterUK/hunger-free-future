package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.TownFinder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TownFinderRepository extends JpaRepository<TownFinder, Long> {

    @Query(value = "SELECT * FROM uk_address ua WHERE LOWER(ua.name) LIKE LOWER( CONCAT(:name, '%')) LIMIT 5", nativeQuery = true)
    List<Map<String, String>> findByNameContains(@Param("name")String name);
}
