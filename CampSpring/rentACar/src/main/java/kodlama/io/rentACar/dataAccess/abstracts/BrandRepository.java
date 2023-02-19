package kodlama.io.rentACar.dataAccess.abstracts;

import kodlama.io.rentACar.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer>{
    //1 interface diğer interfaci extend edebilir
}
