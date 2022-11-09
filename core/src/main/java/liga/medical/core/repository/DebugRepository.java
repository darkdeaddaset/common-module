package liga.medical.core.repository;

import liga.medical.core.model.Debug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebugRepository extends JpaRepository<Debug, Long> {
}
