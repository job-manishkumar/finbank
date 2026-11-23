package org.finbank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectConfig {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.httpBasic(Customizer.withDefaults());
        http.authorizeHttpRequests(arc -> arc.anyRequest().authenticated());
//        var newUser = User.withUsername("user").password("password").build();
//        var userService = new InMemoryUserDetailsManager(newUser);
//        http.userDetailsService(userService);
        return http.build();
    }

//    @Bean
//    public UserDetailsService userDetailsService() {
//        var user1 = User.withUsername("manish").password("12345").build();
//        var user2 = User.withUsername("admin").password("admin").build();
//        return new InMemoryUserDetailsManager(user1, user2);
//    }
//
//    @Bean
//    PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }

}
