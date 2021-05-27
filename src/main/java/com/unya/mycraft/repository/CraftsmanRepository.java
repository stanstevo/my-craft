package com.unya.mycraft.repository;

import com.unya.mycraft.entity.Craftsman;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CraftsmanRepository extends JpaRepository<Craftsman, Integer> {
}
