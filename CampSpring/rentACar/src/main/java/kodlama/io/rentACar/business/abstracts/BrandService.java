package kodlama.io.rentACar.business.abstracts;

import java.util.List;
import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;

public interface BrandService {

    List<GetAllBrandResponse> getAll();

    void add(CreateBrandRequest createBrandRequest);
}
