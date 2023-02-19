package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.request.UpdateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import kodlama.io.rentACar.configuration.responses.GetByIdResponse;

import java.util.List;

public interface IBrandService {

    List<GetAllBrandResponse> getAll();

    GetByIdResponse getById(int id);

    void add(CreateBrandRequest createBrandRequest);

    void update(UpdateBrandRequest updateBrandRequest);

    void delete(int id);
}
