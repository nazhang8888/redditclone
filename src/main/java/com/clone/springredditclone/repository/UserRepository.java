package com.clone.springredditclone.repository;

import com.clone.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User, Long>{
    Optional<User> findByUsername(String username);
}
