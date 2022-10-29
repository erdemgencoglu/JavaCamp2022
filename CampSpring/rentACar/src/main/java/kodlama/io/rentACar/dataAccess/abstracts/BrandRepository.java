package kodlama.io.rentACar.dataAccess.abstracts;

import java.util.List;
import kodlama.io.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

public interface BrandRepository {

    List<Brand> getAll();
}
