package liga.medical.core.repository;

import liga.medical.core.model.Exception;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExceptionRepository extends JpaRepository<Exception, Long> {
}
