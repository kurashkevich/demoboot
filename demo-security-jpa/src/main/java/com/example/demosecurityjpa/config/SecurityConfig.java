package com.example.demosecurityjpa.config;

import com.example.demosecurityjpa.service.user.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity( securedEnabled = true )
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserServiceImpl userService;


    @Autowired
    public void configureAuth(AuthenticationManagerBuilder auth) throws Exception{
       // System.out.println(userService.loadUserByUsername("v.kur@gmail.com").getPassword() + "!!");
        auth.userDetailsService(userService);
       /* auth
            .inMemoryAuthentication()
            .withUser("dan")
            .password("{noop}pass")
            .roles("ADMIN")
            .and()
            .withUser("joe")
            .password("{noop}pass")
            .roles("USER");*/
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers("/css/**", "/index").permitAll()
            .antMatchers("/console/**", "/index").permitAll()
            .antMatchers("/posts/**").hasRole("ADMIN")
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .usernameParameter("email")
            .permitAll()
            .and()
            .logout()
            .logoutSuccessUrl("/login?logout")
            .permitAll();
    }





}