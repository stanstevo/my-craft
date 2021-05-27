package com.unya.mycraft.repository;

import com.unya.mycraft.entity.Craft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CraftRepository extends JpaRepository<Craft, Integer> {
}
