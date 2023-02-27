package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.request.CreateModelRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import kodlama.io.rentACar.configuration.responses.GetModelResponse;

import java.util.List;

public interface IModelService {
    List<GetModelResponse> getAll();

    void add(CreateModelRequest createModelRequest);
}
