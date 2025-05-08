package com.m1ddler.spring.security.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class MySecurityConfig {
private final DataSource dataSource;

    @Autowired
    public MySecurityConfig(DataSource dataSource) {
        this.dataSource = dataSource;
   }

   @Bean
   public JdbcUserDetailsManager userDetailsManager() {
        return new JdbcUserDetailsManager(dataSource);
   }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/").hasAnyRole("HR", "MANAGER", "EMPLOYEE")
                        .requestMatchers("/manager_info").hasAnyRole("HR", "MANAGER")
                        .requestMatchers("/hr_info").hasAnyRole("HR")
                        .anyRequest().authenticated()
                )
                .formLogin(Customizer.withDefaults());

        return http.build();
    }
}

