package com.example.demo.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.GET, "/user/info", "/api/foos/**")
                .hasAuthority("SCOPE_read")
                .antMatchers(HttpMethod.POST, "/api/foos")
                .hasAuthority("SCOPE_white")
                .anyRequest().authenticated()
                .and().oauth2ResourceServer().jwt();
    }
}
