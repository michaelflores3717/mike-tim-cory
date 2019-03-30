package com.example.symbri.repositories;

import com.example.symbri.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Users extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
