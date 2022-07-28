package uz.ml.delivering_rest;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition
@SpringBootApplication
public class DeliveringRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeliveringRestApplication.class, args);
    }
}
