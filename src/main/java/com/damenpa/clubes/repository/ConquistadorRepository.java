package com.damenpa.clubes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.damenpa.clubes.entity.Conquistador;

@Repository
public interface ConquistadorRepository extends JpaRepository<Conquistador, Integer> {
}

