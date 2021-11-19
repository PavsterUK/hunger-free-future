package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.domain.Need;
import org.springframework.data.repository.CrudRepository;

public interface NeedRepository extends CrudRepository<Need, Long> {
}
