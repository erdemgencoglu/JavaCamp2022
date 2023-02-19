/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodlama.io.rentACar.presentation;

import java.util.List;
import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.configuration.request.CreateBrandRequest;
import kodlama.io.rentACar.configuration.responses.GetAllBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erdem
 */
@RestController //annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandController {

    IBrandService IBrandService;
    @GetMapping("/getall")
    public List<GetAllBrandResponse> getBrands() {
        return IBrandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateBrandRequest createBrandRequest) {
        IBrandService.add(createBrandRequest);
    }

}
