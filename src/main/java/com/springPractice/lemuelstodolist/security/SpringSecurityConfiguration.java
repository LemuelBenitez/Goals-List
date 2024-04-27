package com.springPractice.lemuelstodolist.security;

public class SpringSecurityConfiguration {

//	@Bean
//	public PasswordEncoder passwordEncoder() {
//		return new BCryptPasswordEncoder();
//	}
//
//	private UserDetails createNewUser(String username, String password) {
//		Function<String, String> passwordEncoder = input -> passwordEncoder().encode(input);
//
//		UserDetails userDetails = User.builder().passwordEncoder(passwordEncoder).username(username).password(password)
//				.roles("USER", "ADMIN").build();
//		return userDetails;
//	}
//
//	@Bean
//	public InMemoryUserDetailsManager createUserDetailsManager() {
//
//		UserDetails userDetails1 = createNewUser("Lemuel", "password");
//		UserDetails userDetails2 = createNewUser("user", "password");
//
//		return new InMemoryUserDetailsManager(userDetails1, userDetails2);
//	}
//
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//
//		http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
//		http.formLogin(withDefaults());
//
//		http.csrf().disable();
//		http.headers().frameOptions().disable();
//
//		return http.build();
//	}

}