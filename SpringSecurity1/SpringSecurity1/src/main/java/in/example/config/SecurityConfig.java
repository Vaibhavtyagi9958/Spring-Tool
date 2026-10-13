package in.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    // Step 1: Define the user (username + password)
    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails user = User.withUsername("admin")
                .password(passwordEncoder.encode("password123"))
                .roles("USER")
                .build();

        UserDetails manager = User.withUsername("manager")
                .password(passwordEncoder.encode("manager@123"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user, manager);
    }

    // Step 2: Define password encoder
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Step 3: Configure access rules
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // disable for simplicity
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/home").permitAll()  // public endpoints
                        .requestMatchers("/admin/**").hasRole("ADMIN") // restricted
                        .anyRequest().authenticated() // all others need login
                )
//                .formLogin(form -> form
//                        .loginPage("/login")    // custom login page
//                        .permitAll()
//                )
                .logout(logout -> logout.permitAll());
        return http.build();
    }
}