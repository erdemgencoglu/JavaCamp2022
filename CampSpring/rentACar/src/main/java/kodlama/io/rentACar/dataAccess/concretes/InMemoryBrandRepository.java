package kodlama.io.rentACar.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;

public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    //(Contsructer) Instence oluşturulduğunda ilk çalışacak method
    public InMemoryBrandRepository() {
        this.brands = new ArrayList<>();
        //Örnek data
        this.brands.add(new Brand(1, "BMW"));
        this.brands.add(new Brand(2, "Mercedes"));
        this.brands.add(new Brand(3, "Audi"));
        this.brands.add(new Brand(4, "Fiyat"));
        this.brands.add(new Brand(5, "Renault"));
    }

    @Override
    public List<Brand> getAll() {
        return this.brands;
    }

}
