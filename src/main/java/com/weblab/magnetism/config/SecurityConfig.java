package com.weblab.magnetism.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // authorization
    // SpringSecurity configuration
    public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .requestMatchers("/auth/login", "/error")
                .permitAll()
//                .antMatchers("/auth/login", "/error").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("auth/login").loginProcessingUrl("/process-login")
                .defaultSuccessUrl("/ui/user/list", true)
                .failureUrl("/auth/login?error");
        return http.build();
    }

}
