package com.library122022.getway.configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JsonObjectMapper {

    private static final ObjectMapper jsonObjectMapper = new ObjectMapper();

    @Bean
    public static ObjectMapper jsonObjectMapper(){
        return jsonObjectMapper;
    }

}
