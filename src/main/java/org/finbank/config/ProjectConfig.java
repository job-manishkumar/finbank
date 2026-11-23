package org.finbank.config;

import org.finbank.component.InMemoryUserDetailService;
import org.finbank.component.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;

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

    @Bean
    public UserDetailsService userDetailsService() {
//        var user1 = User.withUsername("manish").password("98765").build();
//        var user2 = User.withUsername("admin").password("admin").build();
//        DummyUser user3 = new DummyUser();
//        return new InMemoryUserDetailsManager(user1, user2, user3);
        User user = new User("manish", "98765", "read");

        return new InMemoryUserDetailService(List.of(user));
    }

    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

}
