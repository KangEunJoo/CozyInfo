package com.example.kakao;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Override
	//security 폼 로그인 없애기
	  protected void configure(HttpSecurity httpSecurity) throws Exception {
	    httpSecurity.httpBasic().disable();
	  }
}
