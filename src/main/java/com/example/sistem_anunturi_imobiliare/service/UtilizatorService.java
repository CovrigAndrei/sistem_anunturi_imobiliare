package com.example.sistem_anunturi_imobiliare.service;

import com.example.sistem_anunturi_imobiliare.model.Utilizator;
import com.example.sistem_anunturi_imobiliare.repository.UtilizatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UtilizatorService {
    private final UtilizatorRepository utilizatorRepository;
    @Autowired
    public UtilizatorService(UtilizatorRepository utilizatorRepository) {
        this.utilizatorRepository = utilizatorRepository;
    }

    public List<Utilizator> findAll() {
        return utilizatorRepository.findAll();
    }

    public Optional<Utilizator> findById(int id) {
        return utilizatorRepository.findById(id);
    }

    public Utilizator save(Utilizator utilizator) {
        return utilizatorRepository.save(utilizator);
    }

    public Utilizator update(Utilizator utilizator) {
        return utilizatorRepository.save(utilizator);
    }

    public void delete(int id) {
        utilizatorRepository.deleteById(id);
    }
}
