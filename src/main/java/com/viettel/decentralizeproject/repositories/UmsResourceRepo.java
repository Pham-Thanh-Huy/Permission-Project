package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsResourceRepo extends JpaRepository<UmsResource, Long> {
}
