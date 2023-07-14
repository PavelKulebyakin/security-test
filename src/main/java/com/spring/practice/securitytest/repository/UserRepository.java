package com.spring.practice.securitytest.repository;

import com.spring.practice.securitytest.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
