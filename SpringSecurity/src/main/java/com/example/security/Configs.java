package com.example.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Configs extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("kunal")
		.password("12345")
		.roles("admin")
		.and()
		.withUser("test")
		.password("12345")
		.roles("user");
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/delete").hasRole("admin")
		.antMatchers("/info").permitAll();
	}
	
	@Bean
	public PasswordEncoder getpassEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
}
