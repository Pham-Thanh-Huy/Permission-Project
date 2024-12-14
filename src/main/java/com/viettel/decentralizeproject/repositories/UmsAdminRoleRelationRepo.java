package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsAdminRoleRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsAdminRoleRelationRepo extends JpaRepository<UmsAdminRoleRelation, Long> {
}
