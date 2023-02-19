package kodlama.io.rentACar.configuration.core.utilties.mapper;

import org.modelmapper.ModelMapper;

public interface IModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();

}
