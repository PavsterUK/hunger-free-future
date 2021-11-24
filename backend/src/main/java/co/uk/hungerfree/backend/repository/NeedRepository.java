package co.uk.hungerfree.backend.repository;

import co.uk.hungerfree.backend.model.Need;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NeedRepository extends JpaRepository<Need, String> {
}
