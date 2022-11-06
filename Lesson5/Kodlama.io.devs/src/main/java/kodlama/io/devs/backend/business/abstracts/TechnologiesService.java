package kodlama.io.devs.backend.business.abstracts;

import java.util.List;
import kodlama.io.devs.backend.model.Technologies;
import kodlama.io.devs.backend.model.vm.request.TechnologyReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;

/**
 *
 * @author erdem
 */
public interface TechnologiesService {

    List<Technologies> getAll();

    Technologies getTechnologies(int id) throws Exception;

    GenericResp add(TechnologyReq technologies) throws Exception;

    GenericResp update(TechnologyReq technologies) throws Exception;

    GenericResp delete(int id) throws Exception;
}
