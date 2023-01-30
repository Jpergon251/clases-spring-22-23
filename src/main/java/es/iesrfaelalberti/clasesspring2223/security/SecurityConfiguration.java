package es.iesrfaelalberti.clasesspring2223.security;

import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;

@Configuration
public class SecurityConfiguration {
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return (web) -> web.ignoring().anyRequest();
    }
}
