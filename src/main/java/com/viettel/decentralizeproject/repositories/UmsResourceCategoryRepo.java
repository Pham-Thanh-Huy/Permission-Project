package com.viettel.decentralizeproject.repositories;

import com.viettel.decentralizeproject.models.UmsResourceCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsResourceCategoryRepo extends JpaRepository<UmsResourceCategory, Long> {
}
