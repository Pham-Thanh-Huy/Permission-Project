package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsRoleMenuRelation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsRoleMenuRealtionRepo extends JpaRepository<UmsRoleMenuRelation, Long> {
}
