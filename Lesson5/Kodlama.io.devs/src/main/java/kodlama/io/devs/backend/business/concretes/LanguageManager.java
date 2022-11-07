package kodlama.io.devs.backend.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kodlama.io.devs.backend.business.abstracts.LanguageService;
import kodlama.io.devs.backend.dataaccess.abstracts.LanguageRepository;
import kodlama.io.devs.backend.dataaccess.abstracts.TechnologiesRepository;
import kodlama.io.devs.backend.model.Language;
import kodlama.io.devs.backend.model.Technologies;
import kodlama.io.devs.backend.model.vm.request.LanguageReq;
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
public class LanguageManager implements LanguageService {

    LanguageRepository languageRepository;
    TechnologiesRepository technologiesRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository, TechnologiesRepository technologiesRepository) {
        this.languageRepository = languageRepository;
        this.technologiesRepository = technologiesRepository;
    }

    @Override
    public List<LanguageResp> getAll() {
        List<LanguageResp> response = new ArrayList<>();
        for (Language language : languageRepository.findAll()) {
            List<TechnologiesResponse> techList = new ArrayList<>();
            for (Technologies technology : language.getTechnologies()) {
                techList.add(new TechnologiesResponse(technology.getName(), technology.getLanguage().getName()));
            }
            LanguageResp lang = new LanguageResp(language.getName(), techList);
            response.add(lang);
        }
        return response;
    }

    @Override
    public LanguageResp getLanguage(int id) throws Exception {
        Optional<Language> inDbLang = languageRepository.findById(id);
        List<TechnologiesResponse> techList = new ArrayList<>();
        if (inDbLang.isEmpty()) {
            throw new Exception("Dil bulunamadı.!");
        }
        LanguageResp resp = new LanguageResp();
        resp.setName(inDbLang.get().getName());
        for (Technologies technology : inDbLang.get().getTechnologies()) {
            techList.add(new TechnologiesResponse(technology.getName(), technology.getLanguage().getName()));
        }
        resp.setTechnologies(techList);
        return resp;
    }

    @Override
    public GenericResp add(LanguageReq req) throws Exception {
        //Checking name
        if (checkNameIsEmpty(req.getName())) {
            throw new Exception("Dil adı boş geçilemez.!");
        }
        //Checking if already added
        if (languageRepository.existsByName(req.getName())) {
            throw new Exception("Bu dil daha önce eklenmis.!");
        }
        //Adding to db
        languageRepository.save(new Language(req.getName()));
        return new GenericResp(req.getName() + " dili sisteme eklendi.", 200);
    }

    @Override
    public GenericResp update(Language langauge) throws Exception {
        if (checkNameIsEmpty(langauge.getName())) {
            throw new Exception("Dil adı boş geçilemez.!");
        }
        //Check language is created
        Optional<Language> inDbLang = languageRepository.findById(langauge.getId());
        if (inDbLang.isEmpty()) {
            throw new Exception("Güncellenmek istenen dil bulunamadı.!");
        }
        //
        inDbLang.get().setName(langauge.getName());
        languageRepository.save(langauge);
        return new GenericResp("Güncelleme işlemi başarılı", 200);
    }

    @Override
    public GenericResp delete(int id) throws Exception {
        if (languageRepository.findById(id).isEmpty()) {
            throw new Exception("Silinmek istenen dil bulunamadı.!");
        }
        //
        languageRepository.deleteById(id);
        return new GenericResp("Silme işlemi başarılı", 200);
    }

    private boolean checkNameIsEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }
}
