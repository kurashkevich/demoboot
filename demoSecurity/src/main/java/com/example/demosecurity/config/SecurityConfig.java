package com.example.demosecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

    /**
     * AuthenticationManagerBuilder - helps o create in-memory users
     * **/
    @Autowired
    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
        auth
            .inMemoryAuthentication()
            .withUser("dan")
            .password("{noop}pass")
            .roles("ADMIN")
            .and()
            .withUser("joe")
            .password("{noop}pass")
            .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/admin/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .permitAll()
            .and()
            .logout()
            .logoutSuccessUrl("/login?logout")
            .permitAll();
    }

}
