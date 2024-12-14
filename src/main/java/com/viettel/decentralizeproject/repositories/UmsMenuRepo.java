package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsMenuRepo extends JpaRepository<UmsMenu, Long> {
}
