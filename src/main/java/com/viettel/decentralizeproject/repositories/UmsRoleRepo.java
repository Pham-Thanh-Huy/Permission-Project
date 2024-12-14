package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsRoleRepo extends JpaRepository<UmsRole, Long> {
}
