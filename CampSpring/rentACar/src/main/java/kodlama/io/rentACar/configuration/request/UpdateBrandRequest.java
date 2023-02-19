package kodlama.io.rentACar.configuration.request;

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
public class UpdateBrandRequest {
    private int id;
    private String name;
}
