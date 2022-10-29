/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package kodlama.io.devs.backend.dataaccess.abstracts;

import java.util.List;
import kodlama.io.devs.backend.entity.Language;

public interface LanguageRepository {

    List<Language> getAll();

    Language getLanguage(int id);

    Language add(Language langauge);

    Language update(Language langauge);

    Language delete(Language langauge);

}
