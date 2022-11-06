package kodlama.io.devs.backend.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import kodlama.io.devs.backend.business.abstracts.LanguageService;
import kodlama.io.devs.backend.dataaccess.abstracts.LanguageRepository;
import kodlama.io.devs.backend.dataaccess.abstracts.TechnologiesRepository;
import kodlama.io.devs.backend.model.Language;
import kodlama.io.devs.backend.model.vm.request.LanguageReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;
import kodlama.io.devs.backend.model.vm.response.LanguageResp;
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
            LanguageResp lang = new LanguageResp(language.getName(), language.getTechnologies());
            response.add(lang);
        }
        return response;
    }

    @Override
    public LanguageResp getLanguage(int id) throws Exception {
        Optional<Language> inDbLang = languageRepository.findById(id);
        if (inDbLang.isEmpty()) {
            throw new Exception("Programlama dili bulunamadı.!");
        }
        LanguageResp resp = new LanguageResp(inDbLang.get().getName(), inDbLang.get().getTechnologies());
        return resp;
    }

    @Override
    public GenericResp add(LanguageReq langauge) throws Exception {
        if (checkNameIsEmpty(langauge.getName())) {
            throw new Exception("Dil adı boş geçilemez.!");
        }
        List<Language> inDblanguages = languageRepository.findAll();
        if (!inDblanguages.isEmpty()) {
            for (Language lang : inDblanguages) {
                if (lang.getId() == langauge.getId()) {
                    throw new Exception("Bu id daha önce kullanılmış.!");
                }
                if (lang.getName().trim().equalsIgnoreCase(langauge.getName().trim())) {
                    throw new Exception("Bu dil daha önce eklenmis.!");
                }
            }
        }

        return new GenericResp(langauge.getName() + " dili sisteme eklendi.", 200);
    }

    @Override
    public GenericResp update(LanguageReq langauge) throws Exception {
        if (checkNameIsEmpty(langauge.getName())) {
            throw new Exception("Dil adı boş geçilemez.!");
        }
        //
        getLanguage(langauge.getId());
        //
        //languageRepository.save(langauge);
        return new GenericResp("Güncelleme işlemi başarılı", 200);
    }

    @Override
    public GenericResp delete(int id) throws Exception {
        LanguageResp dbLanguage = getLanguage(id);
        //
        languageRepository.deleteById(id);
        return new GenericResp("Silme işlemi başarılı", 200);
    }

    private boolean checkNameIsEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }
}
