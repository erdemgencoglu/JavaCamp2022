/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kodlama.io.devs.backend.dataaccess.concretes;

import java.util.ArrayList;
import java.util.List;
import kodlama.io.devs.backend.dataaccess.abstracts.LanguageRepository;
import kodlama.io.devs.backend.entity.Language;
import org.springframework.stereotype.Repository;

/**
 *
 * @author erdem
 */
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages;

    public InMemoryLanguageRepository(List<Language> languages) {
        this.languages = new ArrayList<>();
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getLanguage(int id) {
        for (Language language : languages) {
            if (language.getId() == id) {
                return language;
            }
        }
        return null;
    }

    @Override
    public Language add(Language langauge) {
        this.languages.add(langauge);
        return langauge;
    }

    @Override
    public Language update(Language langauge) {
        for (Language lang : languages) {
            if (lang.getId() == langauge.getId()) {
                lang.setId(langauge.getId());
                lang.setName(langauge.getName());
                return lang;
            }
        }
        return null;
    }

    @Override
    public Language delete(Language langauge) {
        Language referanceLanguage = getLanguage(langauge.getId());
        languages.remove(referanceLanguage);
        return referanceLanguage;
    }

}
