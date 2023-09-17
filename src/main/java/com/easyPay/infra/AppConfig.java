package com.easyPay.infra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
    @Bean
    /*Esta anotación se coloca en métodos dentro de una clase de configuración de Spring para indicar que ese método debe
    ser utilizado para definir un bean (un objeto gestionado por Spring) en el contexto de la aplicación*/

    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
