package com.example.demo;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider
{
	@Override
	public Authentication authenticate(Authentication auth) throws AuthenticationException
	{
		String username = auth.getName();
		String password = auth.getCredentials().toString();
		System.out.println("user: " + username + " password: " + password + " - " + passwordEncoder().encode(password));
		if (("user".equals(username) || "externaluser".equals(username)) && "pass".equals(password))
		{
			return new UsernamePasswordAuthenticationToken(username, password, Collections.emptyList());
		}
		else
		{
			return null;
//			throw new BadCredentialsException("External system authentication failed");
		}
	}

	@Override
	public boolean supports(Class<?> auth)
	{
		return auth.equals(UsernamePasswordAuthenticationToken.class);
	}

	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
}