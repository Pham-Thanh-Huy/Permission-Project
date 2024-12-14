package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsRoleResourceRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsRoleResourceRelationRepo extends JpaRepository<UmsRoleResourceRelation, Long> {
}
