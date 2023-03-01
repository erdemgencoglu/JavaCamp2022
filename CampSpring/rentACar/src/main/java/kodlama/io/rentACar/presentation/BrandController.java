/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodlama.io.rentACar.presentation;

import kodlama.io.rentACar.business.BrandService;
import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.request.UpdateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import kodlama.io.rentACar.configuration.responses.GetByIdResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author erdem
 */
@RestController //annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandController {

    BrandService brandService;

    @GetMapping()
    public List<GetAllBrandResponse> getBrands() {
        return brandService.getAll();
    }

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED)
    public void add(@RequestBody @Valid CreateBrandRequest createBrandRequest) {
        brandService.add(createBrandRequest);
    }

    @GetMapping("/{id}")
    public GetByIdResponse getBrand(@PathVariable int id) {
        return brandService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        brandService.delete(id);
    }

    @PutMapping
    public void update(@RequestBody UpdateBrandRequest updateBrandRequest) {
        brandService.update(updateBrandRequest);
    }
}