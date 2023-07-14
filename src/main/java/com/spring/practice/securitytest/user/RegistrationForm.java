package com.spring.practice.securitytest.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationForm {

    private String username;
    private String password;
    private String fullname;

    public User toUser(PasswordEncoder passwordEncoder) {
        return new User( username, passwordEncoder.encode(password), fullname);
    }
}
