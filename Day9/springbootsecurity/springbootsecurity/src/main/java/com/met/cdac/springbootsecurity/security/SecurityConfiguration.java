package com.met.cdac.springbootsecurity.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{

	private String USER_ROLE = "user";
	
	private String ADMIN_ROLE = "admin";
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		
		auth.inMemoryAuthentication()
			.withUser("admin").password(passwordEncoder().encode("admin@123")).roles(ADMIN_ROLE)
			.and()
			.withUser("user").password(passwordEncoder().encode("user@123")).roles(USER_ROLE);
		
		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
	
		http.authorizeRequests()
			.antMatchers("/rest/user").hasAnyRole(USER_ROLE, ADMIN_ROLE)
			.antMatchers("/rest/admin").hasRole(ADMIN_ROLE)
			.and().formLogin();
	}
	
	
	
	
	
}
