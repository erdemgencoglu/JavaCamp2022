package kodlama.io.devs.backend.business.abstracts;

import java.util.List;
import kodlama.io.devs.backend.entity.Language;

/**
 *
 * @author erdem
 */
public interface LanguageService {

    List<Language> getAll();

    Language getLanguage(int id) throws Exception;

    Language add(Language langauge) throws Exception;

    Language update(Language langauge) throws Exception;

    Language delete(Language langauge) throws Exception;

}
