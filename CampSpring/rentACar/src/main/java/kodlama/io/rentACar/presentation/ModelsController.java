package kodlama.io.rentACar.presentation;

import kodlama.io.rentACar.business.ModelService;
import kodlama.io.rentACar.configuration.request.CreateModelRequest;
import kodlama.io.rentACar.configuration.responses.GetModelResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {

    ModelService modelService;

    @GetMapping
    public List<GetModelResponse> getAllModels() {
        return this.modelService.getAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateModelRequest request) {
        this.modelService.add(request);
    }
}