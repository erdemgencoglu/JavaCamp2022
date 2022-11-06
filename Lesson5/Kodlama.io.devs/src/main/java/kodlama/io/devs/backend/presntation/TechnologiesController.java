package kodlama.io.devs.backend.presntation;

import java.util.List;
import kodlama.io.devs.backend.model.Technologies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import kodlama.io.devs.backend.business.abstracts.TechnologiesService;
import kodlama.io.devs.backend.model.vm.request.TechnologyReq;
import kodlama.io.devs.backend.model.vm.response.GenericResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author erdem
 */
@RestController
@RequestMapping("/api/1.0/technologies")
public class TechnologiesController {
    
    @Autowired
    TechnologiesService technologiesService;
    
    @GetMapping("/getAll")
    private List<Technologies> getAll() {
        return technologiesService.getAll();
    }
    
    @GetMapping("/get{id}")
    private Technologies get(@RequestParam int id) throws Exception {
        return technologiesService.getTechnologies(id);
    }
    
    @PostMapping("/add")
    private GenericResp add(@RequestBody TechnologyReq req) throws Exception {
        return technologiesService.add(req);
    }
}
