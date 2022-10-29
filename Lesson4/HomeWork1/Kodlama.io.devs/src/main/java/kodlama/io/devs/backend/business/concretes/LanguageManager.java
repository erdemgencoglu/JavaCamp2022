package kodlama.io.devs.backend.business.concretes;

import java.util.List;
import kodlama.io.devs.backend.business.abstracts.LanguageService;
import kodlama.io.devs.backend.dataaccess.abstracts.LanguageRepository;
import kodlama.io.devs.backend.entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author erdem
 */
@Service
public class LanguageManager implements LanguageService {

    LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public Language getLanguage(int id) {
        for (Language language : getAll()) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

    @Override
    public Language add(Language langauge) throws Exception {
        if (checkNameIsEmpty(langauge.getName())) {
            throw new Exception("Dil adı boş geçilemez.!");
        }
        List<Language> languages = getAll();
        if (!languages.isEmpty()) {
            for (Language lang : languages) {
                if (lang.getId() == langauge.getId()) {
                    throw new Exception("Bu id daha önce kullanılmış.!");
                }
                if (lang.getName().trim().equalsIgnoreCase(langauge.getName().trim())) {
                    throw new Exception("Bu dil daha önce eklenmis.!");
                }
            }
        }

        return languageRepository.add(langauge);
    }

    @Override
    public Language update(Language langauge) throws Exception {
        if (checkNameIsEmpty(langauge.getName())) {
            throw new Exception("Dil adı boş geçilemez.!");
        }
        if (getLanguage(langauge.getId()) == null) {
            throw new Exception("Güncellenmek istenen dil bulunamadı.!");
        }
        return languageRepository.update(langauge);
    }

    @Override
    public Language delete(Language langauge) throws Exception {
        Language cacheLanguage = getLanguage(langauge.getId());
        if (cacheLanguage == null) {
            throw new Exception("Silinmek istenen dil bulunamadı.!");
        }
        languageRepository.delete(langauge);
        return cacheLanguage;
    }

    private boolean checkNameIsEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }
}
