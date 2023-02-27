package kodlama.io.rentACar.presentation;

import kodlama.io.rentACar.business.ModelService;
import kodlama.io.rentACar.configuration.responses.GetModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelController {

    ModelService modelService;

    @GetMapping
    public List<GetModelResponse> getModels() {
        return modelService.getAll();
    }

}