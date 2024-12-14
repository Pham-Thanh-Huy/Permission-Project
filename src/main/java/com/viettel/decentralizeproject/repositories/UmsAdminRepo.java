package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UmsAdminRepo extends JpaRepository<UmsAdmin, Long> {
    Optional<UmsAdmin> findByUsername(String username);
}
