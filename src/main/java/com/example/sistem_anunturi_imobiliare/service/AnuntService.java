package com.example.sistem_anunturi_imobiliare.service;

import com.example.sistem_anunturi_imobiliare.model.Anunt;
import com.example.sistem_anunturi_imobiliare.repository.AnuntRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnuntService {
    private final AnuntRepository anuntRepository;

    public AnuntService(AnuntRepository anuntRepository) {
        this.anuntRepository = anuntRepository;
    }

    public List<Anunt> findAll() {
        return anuntRepository.findAll();
    }

    public Optional<Anunt> findById(int id) {
        return anuntRepository.findById(id);
    }

    public Anunt save(Anunt anunt) {
        return anuntRepository.save(anunt);
    }

    public Anunt update(Anunt anunt) {
        return anuntRepository.save(anunt);
    }

    public void delete(int id) {
        anuntRepository.deleteById(id);
    }
}
