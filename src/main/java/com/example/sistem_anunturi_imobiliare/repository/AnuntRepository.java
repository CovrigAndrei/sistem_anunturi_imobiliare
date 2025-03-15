package com.example.sistem_anunturi_imobiliare.repository;

import com.example.sistem_anunturi_imobiliare.model.Anunt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnuntRepository extends JpaRepository<Anunt, Integer> {
}