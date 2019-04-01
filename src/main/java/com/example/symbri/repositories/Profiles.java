package com.example.symbri.repositories;

import com.example.symbri.models.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Profiles extends CrudRepository<Profile, Long> {
}
