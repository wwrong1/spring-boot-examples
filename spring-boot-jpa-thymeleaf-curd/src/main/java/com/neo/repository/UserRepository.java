package com.neo.repository;

import com.neo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(long id);

    void deleteById(Long id);
}