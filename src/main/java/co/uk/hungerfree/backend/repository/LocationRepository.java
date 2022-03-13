package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.entity.locationEntity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, String> {

}
