package com.example.sistem_anunturi_imobiliare.controller;

import com.example.sistem_anunturi_imobiliare.model.Anunt;
import com.example.sistem_anunturi_imobiliare.service.AnuntService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AnuntController {
    private final AnuntService anuntService;

    public AnuntController(AnuntService anuntService) {
        this.anuntService = anuntService;
    }

    @GetMapping("/anunturi")
    public List<Anunt> getAll() {
        return anuntService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anunt> getById(@PathVariable int id) {
        return anuntService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/anunturi")
    public Anunt create(@RequestBody Anunt anunt) {
        return anuntService.save(anunt);
    }

    @PutMapping("/anunturi/{id}")
    public ResponseEntity<Anunt> update(@PathVariable int id, @RequestBody Anunt anunt) {
        anunt.setId(id);
        return ResponseEntity.ok(anuntService.update(anunt));
    }

    @PatchMapping("/anunturi/{id}")
    public ResponseEntity<Anunt> partialUpdate(@PathVariable int id, @RequestBody Anunt anunt) {
        return anuntService.findById(id)
                .map(existing -> {
                    if (anunt.getTitlu() != null) existing.setTitlu(anunt.getTitlu());
                    if (anunt.getPret() != 0) existing.setPret(anunt.getPret());
                    if (anunt.getUtilizator() != null) existing.setUtilizator(anunt.getUtilizator());
                    if (anunt.getImobil() != null) existing.setImobil(anunt.getImobil());
                    return ResponseEntity.ok(anuntService.update(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/anunturi/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        anuntService.delete(id);
        return ResponseEntity.ok().build();
    }
}