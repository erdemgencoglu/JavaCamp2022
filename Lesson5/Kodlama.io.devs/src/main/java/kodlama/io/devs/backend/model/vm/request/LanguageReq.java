package kodlama.io.devs.backend.model.vm.request;

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
@AllArgsConstructor
@NoArgsConstructor
public class LanguageReq {
    private int id;
    private String name;
    private List<Technologies> technologies;
}
