package kodlama.io.rentACar.business;

import kodlama.io.rentACar.business.abstracts.IModelService;
import kodlama.io.rentACar.configuration.core.utilties.mapper.ModelMapperService;
import kodlama.io.rentACar.configuration.request.CreateModelRequest;
import kodlama.io.rentACar.configuration.responses.GetModelResponse;
import kodlama.io.rentACar.dataAccess.abstracts.ModelRepository;
import kodlama.io.rentACar.models.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ModelService implements IModelService {
    private ModelRepository modelRepository;
    private ModelMapperService modelMapperService;

    @Override
    public List<GetModelResponse> getAll() {
        List<Model> models = modelRepository.findAll();
        List<GetModelResponse> list = models.stream()
                .map(brand -> this.modelMapperService.forResponse()
                        .map(brand, GetModelResponse.class)).toList();
        return list;
    }

    @Override
    public void add(CreateModelRequest createModelRequest) {
        Model newModel = this.modelMapperService.forRequest().map(createModelRequest, Model.class);
        this.modelRepository.save(newModel);
    }
}
