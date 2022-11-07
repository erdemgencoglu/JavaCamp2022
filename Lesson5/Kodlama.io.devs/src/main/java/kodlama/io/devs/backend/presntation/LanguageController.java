/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodlama.io.devs.backend.presntation;

import java.util.List;
import kodlama.io.devs.backend.business.abstracts.LanguageService;
import kodlama.io.devs.backend.model.Language;
import kodlama.io.devs.backend.model.vm.request.LanguageReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;
import kodlama.io.devs.backend.model.vm.response.LanguageResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author erdem
 */
@RestController
@RequestMapping("/api/1.0/languages")
public class LanguageController {

    LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<LanguageResp> getLanguages() {
        return languageService.getAll();
    }

    @GetMapping("/get/{id}")
    public LanguageResp getLanguage(@PathVariable int id) throws Exception {
        return languageService.getLanguage(id);
    }

    @PostMapping("/add")
    public GenericResp addLanguages(@RequestBody LanguageReq language) throws Exception {
        return languageService.add(language);
    }

    @PutMapping("/update")
    public GenericResp updateLanguages(@RequestBody Language language) throws Exception {
        return languageService.update(language);
    }

    @DeleteMapping("/delete/{id}")
    public GenericResp deleteLanguages(@PathVariable int id) throws Exception {
        return languageService.delete(id);
    }
}
