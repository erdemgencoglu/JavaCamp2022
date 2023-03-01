package kodlama.io.rentACar.business.rules;

import kodlama.io.rentACar.configuration.core.utilties.exception.BusinessException;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
    private BrandRepository brandRepository;

    //Marka ismi tekrar ediyormu
    public void checkIfBrandNameExists(String name) {
        if (this.brandRepository.existsByName(name)) {
            throw new BusinessException("Brand name already exist");
        }
    }
}
