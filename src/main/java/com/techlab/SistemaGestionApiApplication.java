
package com.techlab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// Marca esta clase como el punto de entrada de Spring Boot
@SpringBootApplication
@EnableTransactionManagement
public class SistemaGestionApiApplication {
    public static void main(String[] args) {
        // Lanza la aplicación
        SpringApplication.run(SistemaGestionApiApplication.class, args);
    }
}
