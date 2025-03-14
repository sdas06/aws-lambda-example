package org.example.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

@Configuration
public class XmlConfig {

    @Bean
    public MappingJackson2XmlHttpMessageConverter xmlConverter() {
        return new MappingJackson2XmlHttpMessageConverter();
    }
}
