package com.spring.practice.securitytest;

import com.spring.practice.securitytest.repository.UserRepository;
import com.spring.practice.securitytest.user.RegistrationForm;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SecurityTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityTestApplication.class, args);
    }

    @Bean
    @Profile("test")
    public CommandLineRunner dataLoader(
            UserRepository repository,
            PasswordEncoder encoder) {
        return args -> {
            repository.save(new RegistrationForm("user", "mypas", "Pavel").toUser(encoder));
        };
    }
}
