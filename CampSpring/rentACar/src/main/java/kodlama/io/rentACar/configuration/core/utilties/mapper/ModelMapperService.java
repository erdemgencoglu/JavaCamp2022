package kodlama.io.rentACar.configuration.core.utilties.mapper;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ModelMapperService implements IModelMapperService {

    private ModelMapper modelMapper;

    @Override
    public ModelMapper forResponse() {
        this.modelMapper
                .getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.LOOSE); //Eşleşmeyen fieldlar olabilir bunları yoksay
        return this.modelMapper;
    }

    @Override
    public ModelMapper forRequest() {
        this.modelMapper
                .getConfiguration()
                .setAmbiguityIgnored(true)
                .setMatchingStrategy(MatchingStrategies.STANDARD);
        return this.modelMapper;
    }
}
