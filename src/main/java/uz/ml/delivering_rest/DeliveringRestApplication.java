package uz.ml.delivering_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import uz.ml.delivering_rest.properties.OpenApiProperties;
import uz.ml.delivering_rest.properties.ServiceProperties;

@EnableConfigurationProperties({OpenApiProperties.class, ServiceProperties.class})
@OpenAPIDefinition
@SpringBootApplication
public class DeliveringRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeliveringRestApplication.class, args);
    }
}
