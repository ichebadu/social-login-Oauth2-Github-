package com.login.social.login.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers(HttpMethod.GET,"/").permitAll()
                    .requestMatchers("/swagger-ui/**").permitAll()
                    .requestMatchers("/v3/api-docs/**").permitAll()
                    .anyRequest().authenticated();
                })
                .oauth2Login(withDefaults())
                .formLogin(withDefaults())
                .build();
//       alternative
//        http
//                .csrf()
//                .disable()
//                .authorizeHttpRequests()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .oauth2Login();
//        return http.build();
    }
}
