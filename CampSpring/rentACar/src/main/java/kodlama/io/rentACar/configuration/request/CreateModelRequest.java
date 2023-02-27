package kodlama.io.rentACar.configuration.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author erdem
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateModelRequest {
    @NotNull
    @NotBlank
    @Size(max = 20, min = 3)
    private String name;
    @NotNull
    @NotBlank
    private int brandId;
}
