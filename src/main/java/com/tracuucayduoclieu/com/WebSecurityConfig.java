//package com.tracuucayduoclieu.com;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//public class WebSecurityConfig {
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//		 http.authorizeRequests().antMatchers("/login").permitAll()
//         .antMatchers("/Admin/**").hasAuthority("Admin")
//         .anyRequest().authenticated()
//         .and().formLogin()
//         .loginPage("/login")
//             .usernameParameter("email")
//             .permitAll()
//         .and()
//         .rememberMe().key("AbcdEfghIjklmNopQrsTuvXyz_0123456789")
//         .and()
//         .logout().permitAll();
//
// http.headers().frameOptions().sameOrigin();
//
// return http.build();
//
//	}
//
//	@Bean
//	public WebSecurityCustomizer webSecurityCustomizer() {
//		return null;
//
//	}
//
//}
