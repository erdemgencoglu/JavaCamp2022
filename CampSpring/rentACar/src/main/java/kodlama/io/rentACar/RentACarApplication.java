package kodlama.io.rentACar;

import kodlama.io.rentACar.configuration.core.utilties.exception.BusinessException;
import kodlama.io.rentACar.configuration.core.utilties.exception.ProblemDetails;
import kodlama.io.rentACar.configuration.core.utilties.exception.ValidationProblemDetails;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


import java.util.HashMap;

@SpringBootApplication
public class RentACarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentACarApplication.class, args);
    }

    //Bean spring ioc içerisinde tanımlanan classı ihtiyaç duyulduğunda yoksa yaratır ve kullanımına izin verir
    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
