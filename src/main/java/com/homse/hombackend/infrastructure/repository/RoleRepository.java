package com.homse.hombackend.infrastructure.repository;

import com.homse.hombackend.infrastructure.model.Role;
import com.homse.hombackend.infrastructure.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName rolename);
}
