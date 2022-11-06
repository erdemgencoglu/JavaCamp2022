package kodlama.io.devs.backend.business.abstracts;

import java.util.List;
import kodlama.io.devs.backend.model.vm.request.LanguageReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;
import kodlama.io.devs.backend.model.vm.response.LanguageResp;

/**
 *
 * @author erdem
 */
public interface LanguageService {

    List<LanguageResp> getAll();

    LanguageResp getLanguage(int id) throws Exception;

    GenericResp add(LanguageReq langauge) throws Exception;

    GenericResp update(LanguageReq langauge) throws Exception;

    GenericResp delete(int id) throws Exception;

}
