package kodlama.io.rentACar.business;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.business.rules.BrandBusinessRules;
import kodlama.io.rentACar.configuration.core.utilties.mapper.ModelMapperService;
import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.request.UpdateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import kodlama.io.rentACar.configuration.responses.GetByIdResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.models.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BrandService implements IBrandService {

    private BrandRepository brandRepository;
    private ModelMapperService modelMapperService;
    private BrandBusinessRules brandBusinessRules;

    @Override
    public List<GetAllBrandResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();

        List<GetAllBrandResponse> list = brands.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetAllBrandResponse.class)).toList();
        return list;
    }

    @Override
    public GetByIdResponse getById(int id) {
        Brand brandInDb = this.brandRepository.findById(id).orElseThrow();
        GetByIdResponse response = this.modelMapperService.forResponse().map(brandInDb, GetByIdResponse.class);
        return response;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        //rules
        this.brandBusinessRules.checkIfBrandNameExists(createBrandRequest.getName());

        Brand newBrand = this.modelMapperService.forRequest().map(createBrandRequest, Brand.class);
        brandRepository.save(newBrand);
    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand newBrand = this.modelMapperService.forRequest().map(updateBrandRequest, Brand.class);
        brandRepository.save(newBrand);
    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
    }
}
