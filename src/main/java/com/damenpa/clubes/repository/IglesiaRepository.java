package com.damenpa.clubes.repository;

import com.damenpa.clubes.entity.Iglesia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IglesiaRepository extends JpaRepository<Iglesia, Integer> {
}
