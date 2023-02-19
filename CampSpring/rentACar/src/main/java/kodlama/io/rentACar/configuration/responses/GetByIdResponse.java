package kodlama.io.rentACar.configuration.responses;

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
public class GetByIdResponse {
    private int id;
    private String name;
}
