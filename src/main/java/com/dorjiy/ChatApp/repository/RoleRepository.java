package com.dorjiy.ChatApp.repository;

import com.dorjiy.ChatApp.model.ERole;
import com.dorjiy.ChatApp.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
