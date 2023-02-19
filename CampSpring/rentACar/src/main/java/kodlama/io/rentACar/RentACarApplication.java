package kodlama.io.rentACar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
