package kodlama.io.rentACar.business;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.configuration.core.utilties.mapper.ModelMapperService;
import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.models.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandService implements IBrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandResponse> list = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                .map(brand, GetAllBrandResponse.class)).toList();
        return list;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand newBrand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        brandRepository.save(newBrand);
    }
}
