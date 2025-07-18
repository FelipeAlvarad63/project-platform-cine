package com.projectfullstack.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
            .csrf(csrf -> csrf.disable()) // Desactiva CSRF para facilitar el desarrollo
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/**").permitAll() // Permite todas las rutas bajo /api/
                .anyRequest().permitAll() // Permite el resto
            )
            .build();
    }
}
