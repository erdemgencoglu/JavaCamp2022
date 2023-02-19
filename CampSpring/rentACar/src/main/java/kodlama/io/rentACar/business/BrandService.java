package kodlama.io.rentACar.business;

import java.util.ArrayList;
import java.util.List;
import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.models.Brand;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BrandService implements IBrandService {

    private BrandRepository brandRepository;

    @Override
    public List<GetAllBrandResponse> getAll() {
        List<GetAllBrandResponse> list = new ArrayList<>();
        for (Brand brand : brandRepository.findAll()) {
            list.add(new GetAllBrandResponse(brand.getId(), brand.getName()));
        }
        return list;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand newBrand = new Brand();
        newBrand.setName(createBrandRequest.getName());
        brandRepository.save(newBrand);
    }
}
