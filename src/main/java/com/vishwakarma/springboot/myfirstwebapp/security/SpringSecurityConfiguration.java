package com.vishwakarma.springboot.myfirstwebapp.security;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SpringSecurityConfiguration {
	// when we want to store userID and password typically we use
	// LDAP or Database
	// In memory

	// we are using -> In memory configuration

	// InMemoryUserDetailsManager
	// InMemoryUserDetailsManager(UserDetails... users)

	@Bean
	public InMemoryUserDetailsManager createUserDetailsManager() {

		UserDetails userDetails1 = createNewUser("karma2003", "dummy1");
		UserDetails userDetails2 = createNewUser("rohit2003", "dummy2");

		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
	}

	private UserDetails createNewUser(String username, String password) {
		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
		UserDetails userDetails = User.builder()
				.passwordEncoder(passwordEncoder)
				.username(username)
				.password(password)
				.roles("USER", "ADMIN")
				.build();
		
		return userDetails;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// ALL URLs are protected
	// A login form is shown for unauthorized requests
	// we need to do -> CSRF disable
	// Frames

	@Bean
	// SecurityFilterChain: Defines a filter chain matched against every request

	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		
		
		http.authorizeHttpRequests(
				 auth -> auth.anyRequest().authenticated());
		http.formLogin(withDefaults());
		
		http.csrf().disable();
		http.headers().frameOptions().disable();
		
		
		
		return http.build();
	}

}
