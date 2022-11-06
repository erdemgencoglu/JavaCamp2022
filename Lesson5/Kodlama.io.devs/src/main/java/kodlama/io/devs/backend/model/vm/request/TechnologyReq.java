package kodlama.io.devs.backend.model.vm.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author erdem
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyReq {

    private String name;
    private int languageId;
}
