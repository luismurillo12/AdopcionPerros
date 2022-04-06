/*package com.adopcion;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("luis")
                .password("{noop}123")
                .roles("ADMIN", "USER")
                .and()
                .withUser("kevin")
                .password("{noop}123")
                .roles("USER");
    }

    public void addViewControllers(ViewControllerRegistry registro) {
        registro.addViewController("/").setViewName("index");
        registro.addViewController("/login");
        registro.addViewController("/errores/403");
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/admin", "/index", "/persona","/adoptar","/acercade","/producto", "/humanidad")
                .hasRole("ADMIN")
                .antMatchers("/index", "/persona","/adoptar","/acercade","/producto", "/humanidad")
                .hasAnyRole("USER")
                .antMatchers("/")
                .hasAnyRole("USER", "ADMIN")
                .and()
                .formLogin()
                .loginPage("/login");
                
    }
    

}*/
