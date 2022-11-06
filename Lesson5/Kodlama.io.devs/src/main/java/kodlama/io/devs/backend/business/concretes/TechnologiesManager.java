package kodlama.io.devs.backend.business.concretes;

import java.util.List;
import java.util.Optional;
import kodlama.io.devs.backend.business.abstracts.LanguageService;
import kodlama.io.devs.backend.business.abstracts.TechnologiesService;
import kodlama.io.devs.backend.dataaccess.abstracts.TechnologiesRepository;
import kodlama.io.devs.backend.model.Language;
import kodlama.io.devs.backend.model.Technologies;
import kodlama.io.devs.backend.model.vm.request.TechnologyReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;
import kodlama.io.devs.backend.model.vm.response.LanguageResp;
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
    LanguageService languageService;

    @Override
    public List<Technologies> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Technologies getTechnologies(int id) throws Exception {
        Optional<Technologies> technology = technologiesRepository.findById(id);
        if (technology.isEmpty()) {
            return null;
        }
        return technology.get();
    }

    @Override
    public GenericResp add(TechnologyReq technologies) throws Exception {
        GenericResp resp = new GenericResp();
        if (checkNameIsEmpty(technologies.getName())) {
            resp.setMessage("Teknoloji ismi boş geçilemez.!");
            return resp;
        }
        if (technologies.getLanguageId() == 0) {
            resp.setMessage("Teknoloji eklemek istediğiniz program dili belirtilmelidir.!");
            return resp;
        }
        Technologies inDb = technologiesRepository.findByName(technologies.getName());
        if (inDb != null) {
            resp.setMessage("Bu teknoloji daha önce bir programlama diline eklenmiş");
            return resp;
        }
        LanguageResp inDbLang = languageService.getLanguage(technologies.getLanguageId());
        if (inDbLang == null) {
            resp.setMessage("Teknoloji eklenmek istenen programlama dili bulunamadı.!");
            return resp;
        }
        Technologies tech = new Technologies(technologies.getName(), null);
        technologiesRepository.save(tech);
        resp.setMessage("Teknoloji ekleme başarılı.");
        return resp;
    }

    @Override
    public GenericResp update(TechnologyReq technologies) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public GenericResp delete(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean checkNameIsEmpty(String name) {
        return name == null || name.trim().isEmpty();
    }
}
