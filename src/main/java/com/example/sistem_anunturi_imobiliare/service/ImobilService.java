package com.example.sistem_anunturi_imobiliare.service;

import com.example.sistem_anunturi_imobiliare.model.Imobil;
import com.example.sistem_anunturi_imobiliare.repository.ImobilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ImobilService {
    private final ImobilRepository imobilRepository;

    public ImobilService(ImobilRepository imobilRepository) {
        this.imobilRepository = imobilRepository;
    }

    public List<Imobil> findAll() {
        return imobilRepository.findAll();
    }

    public Optional<Imobil> findById(int id) {
        return imobilRepository.findById(id);
    }

    public Imobil save(Imobil imobil) {
        return imobilRepository.save(imobil);
    }

    public Imobil update(Imobil imobil) {
        return imobilRepository.save(imobil);
    }

    public void delete(int id) {
        imobilRepository.deleteById(id);
    }
}