package kodlama.io.rentACar.configuration.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetModelResponse {
    private int id;
    private String name;
    private String brandName;//mapper clasından otomatik olarak brand clasından name parametresni bulur ve eşler
}
