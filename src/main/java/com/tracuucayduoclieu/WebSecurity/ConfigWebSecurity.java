package com.tracuucayduoclieu.WebSecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class ConfigWebSecurity {

	@Autowired
	private UserdetailserviceImp userdetailservice;

	@Autowired
	private UserAuthenticationSuccessHandler successhandler;
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests().antMatchers("/Admin/**").hasAnyAuthority("ADMIN")
			.antMatchers("/TraCuuCayDuocLieu/Post/**").authenticated().antMatchers("/TraCuuCayDuocLieu/Post/**")
			.hasAnyAuthority("CLIENT","ADMIN")
			.antMatchers("/TraCuuCayDuocLieu/Tra-Loi-Cau-Hoi/**").authenticated().antMatchers("/TraCuuCayDuocLieu/Tra-Loi-Cau-Hoi/**").hasAnyAuthority("ADMIN","CLIENT")
			.antMatchers("/TraCuuCayDuocLieu/Bao-Cao/**").authenticated().antMatchers("/TraCuuCayDuocLieu/Bao-Cao/**").hasAnyAuthority("ADMIN","CLIENT")
			.anyRequest().permitAll()
			.and().formLogin().successHandler(successhandler).loginPage("/login").and().sessionManagement().maximumSessions(1).sessionRegistry( sessionRegistry());
		http.csrf().disable();
	return http.build();
	}

	@Bean
    public AuthenticationManager authManager(HttpSecurity http) throws Exception {
        AuthenticationManagerBuilder authenticationManagerBuilder = 
            http.getSharedObject(AuthenticationManagerBuilder.class);
        authenticationManagerBuilder.userDetailsService(userdetailservice);
        return authenticationManagerBuilder.build();
    }

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public SessionRegistry sessionRegistry() {
	    return new SessionRegistryImpl();
	}

}
