package kodlama.io.devs.backend.business.abstracts;

import java.util.List;
import kodlama.io.devs.backend.model.Technologies;
import kodlama.io.devs.backend.model.vm.request.TechnologyReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;
import kodlama.io.devs.backend.model.vm.response.TechnologiesResponse;

/**
 *
 * @author erdem
 */
public interface TechnologiesService {

    List<TechnologiesResponse> getAll();

    TechnologiesResponse getTechnologies(int id) throws Exception;

    GenericResp add(TechnologyReq technologies) throws Exception;

    GenericResp update(Technologies technologies) throws Exception;

    GenericResp delete(int id) throws Exception;
}
