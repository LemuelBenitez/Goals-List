package com.springPractice.lemuelstodolist.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

public class SpringSecurityConfigurationOverride extends WebSecurityConfiguration {
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		httpSecurity.authorizeRequests().requestMatchers("/").permitAll();
	}
}
