package kodlama.io.devs.backend.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kodlama.io.devs.backend.business.abstracts.LanguageService;
import kodlama.io.devs.backend.business.abstracts.TechnologiesService;
import kodlama.io.devs.backend.dataaccess.abstracts.LanguageRepository;
import kodlama.io.devs.backend.dataaccess.abstracts.TechnologiesRepository;
import kodlama.io.devs.backend.model.Language;
import kodlama.io.devs.backend.model.Technologies;
import kodlama.io.devs.backend.model.vm.request.TechnologyReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;
import kodlama.io.devs.backend.model.vm.response.LanguageResp;
import kodlama.io.devs.backend.model.vm.response.TechnologiesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author erdem
 */
@Service
public class TechnologiesManager implements TechnologiesService {

    @Autowired
    TechnologiesRepository technologiesRepository;

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public List<TechnologiesResponse> getAll() {
        List<TechnologiesResponse> techList = new ArrayList<>();
        for (Technologies technologies : technologiesRepository.findAll()) {
            techList.add(new TechnologiesResponse(technologies.getName(), technologies.getLanguage().getName()));
        }
        return techList;
    }

    @Override
    public TechnologiesResponse getTechnologies(int id) throws Exception {
        Optional<Technologies> technology = technologiesRepository.findById(id);
        if (technology.isEmpty()) {
            throw new Exception("Teknoloji bulunamad─▒.!");
        }
        TechnologiesResponse resp = new TechnologiesResponse(technology.get().getName(), technology.get().getLanguage().getName());
        return resp;
    }

    @Override
    public GenericResp add(TechnologyReq technologies) throws Exception {
        if (checkNameIsEmpty(technologies.getName())) {
            throw new Exception("Teknoloji ismi bo┼č ge├žilemez.!");
        }
        //if already added
        Technologies inDb = technologiesRepository.findByName(technologies.getName());
        if (inDb != null) {
            throw new Exception("Eklenmek istenen teknoloji daha ├Ânce eklenmi┼č.!");
        }
        //Check language is created
        Optional<Language> inDblang = languageRepository.findById(technologies.getLanguageId());
        if (inDblang.isEmpty()) {
            throw new Exception("Teknoloji eklenmek istenen dil bulunamad─▒.!");
        }
        //Adding
        Technologies tech = new Technologies(technologies.getName(), inDblang.get());
        technologiesRepository.save(tech);
        return new GenericResp("Teknoloji ekleme ba┼čar─▒l─▒.", 200);
    }

    @Override
    public GenericResp update(Technologies technologies) throws Exception {
        if (checkNameIsEmpty(technologies.getName())) {
            throw new Exception("Teknoloji ad─▒ bo┼č ge├žilemez.!");
        }
        //Check technology is created
        Optional<Technologies> inDbTech = technologiesRepository.findById(technologies.getId());
        if (inDbTech.isEmpty()) {
            throw new Exception("G├╝ncellenmek istenen teknoloji buluamad─▒.!");
        }
        //update operation
        inDbTech.get().setName(technologies.getName());
        technologiesRepository.save(inDbTech.get());
        return new GenericResp("G├╝ncelleme i┼člemi ba┼čar─▒l─▒", 200);
    }

    @Override
    public GenericResp delete(int id) throws Exception {
        //Check teknology is there
        if (technologiesRepository.findById(id).isEmpty()) {
            throw new Exception("Silinmek istenen teknoloji buluamad─▒.!");
        }
        //
        technologiesRepository.deleteById(id);
        return new GenericResp("Silme i┼člemi ba┼čar─▒l─▒.", 200);
    }

    private boolean checkNameIsEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }
}
