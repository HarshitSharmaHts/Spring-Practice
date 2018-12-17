package com.practice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class RESTSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder managerBuilder) throws Exception {
		managerBuilder
			.inMemoryAuthentication()
			.withUser("user").password("{noop}hello").authorities("ROLE_USER")
			.and()
			.withUser("admin").password("{noop}world").authorities("ROLE_ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/admin*")
			.hasRole("ADMIN")
			.antMatchers("/user*")
			.hasRole("USER")
			.antMatchers("/","/not-protected*").permitAll()
			.and()
			.httpBasic();
	}

}
