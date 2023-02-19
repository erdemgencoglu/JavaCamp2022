/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodlama.io.rentACar.presentation;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author erdem
 */
@RestController //annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandController {

    IBrandService IBrandService;

    @GetMapping()
    public List<GetAllBrandResponse> getBrands() {
        return IBrandService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        IBrandService.add(createBrandRequest);
    }

}
