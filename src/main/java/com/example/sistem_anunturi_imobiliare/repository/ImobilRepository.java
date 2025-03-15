package com.example.sistem_anunturi_imobiliare.repository;

import com.example.sistem_anunturi_imobiliare.model.Imobil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImobilRepository extends JpaRepository<Imobil, Integer> {
}