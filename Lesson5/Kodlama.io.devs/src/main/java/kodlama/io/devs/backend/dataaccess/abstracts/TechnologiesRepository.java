package kodlama.io.devs.backend.dataaccess.abstracts;

import kodlama.io.devs.backend.model.Technologies;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author erdem
 */
public interface TechnologiesRepository extends JpaRepository<Technologies, Integer> {

    Technologies findByName(String name);
}
