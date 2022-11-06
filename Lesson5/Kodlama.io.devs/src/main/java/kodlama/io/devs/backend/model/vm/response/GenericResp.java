package kodlama.io.devs.backend.model.vm.response;

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
public class GenericResp {

    private String message;
    private int status;
}
