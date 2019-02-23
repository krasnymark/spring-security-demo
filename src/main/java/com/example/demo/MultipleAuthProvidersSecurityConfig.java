package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

// https://www.baeldung.com/spring-security-multiple-auth-providers

@EnableWebSecurity
public class MultipleAuthProvidersSecurityConfig extends WebSecurityConfigurerAdapter
{
//	@Autowired
//	CustomAuthenticationProvider customAuthProvider;
//
//	@Override
//	public void configure(AuthenticationManagerBuilder auth) throws Exception
//	{
//		auth.authenticationProvider(customAuthProvider);
//		auth.inMemoryAuthentication().withUser("memuser").password(passwordEncoder2().encode("pass")).roles("USER");
//	}
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception
//	{
//		http.httpBasic()
//		.and().authorizeRequests().antMatchers("/resource/**").authenticated()
//		.and().authorizeRequests().antMatchers("/**").authenticated();
//	}
//
//	@Bean
//	public PasswordEncoder passwordEncoder2()
//	{
//		return new BCryptPasswordEncoder();
//	}
}