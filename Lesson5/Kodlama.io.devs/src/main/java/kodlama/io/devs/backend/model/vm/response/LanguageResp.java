package kodlama.io.devs.backend.model.vm.response;

import java.util.List;
import kodlama.io.devs.backend.model.Technologies;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author erdem
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LanguageResp {

    private String name;
    private List<TechnologiesResponse> technologies;
}
