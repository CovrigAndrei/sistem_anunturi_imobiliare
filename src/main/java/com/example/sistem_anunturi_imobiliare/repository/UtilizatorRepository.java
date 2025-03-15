package com.example.sistem_anunturi_imobiliare.repository;

import com.example.sistem_anunturi_imobiliare.model.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilizatorRepository extends JpaRepository<Utilizator, Integer> {
}
