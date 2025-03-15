package com.example.sistem_anunturi_imobiliare.controller;

import com.example.sistem_anunturi_imobiliare.model.Utilizator;
import com.example.sistem_anunturi_imobiliare.service.UtilizatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UtilizatorController {
    private final UtilizatorService utilizatorService;
    @Autowired
    public UtilizatorController(UtilizatorService utilizatorService) {
        this.utilizatorService = utilizatorService;
    }

    //Metoda GET
    @GetMapping("/utilizatori")
    public List<Utilizator> getAll() {
        return utilizatorService.findAll();
    }

    //Metoda GET by Id
    @GetMapping("/utilizatori/{id}")
    public ResponseEntity<Utilizator> getById(@PathVariable int id) {
        return utilizatorService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //Metoda POST
    @PostMapping("/utilizatori")
    public Utilizator create(@RequestBody Utilizator utilizator) {
        return utilizatorService.save(utilizator);
    }

    //Metoda PUT
    @PutMapping("/utilizatori/{id}")
    public ResponseEntity<Utilizator> update(@PathVariable int id, @RequestBody Utilizator utilizator) {
        utilizator.setId(id);
        return ResponseEntity.ok(utilizatorService.update(utilizator));
    }

    //Metoda PATCH
    @PatchMapping("/utilizatori/{id}")
    public ResponseEntity<Utilizator> partialUpdate(@PathVariable int id, @RequestBody Utilizator utilizator) {
        return utilizatorService.findById(id)
                .map(existing -> {
                    if (utilizator.getNume() != null) existing.setNume(utilizator.getNume());
                    if (utilizator.getEmail() != null) existing.setEmail(utilizator.getEmail());
                    if (utilizator.getTelefon() != null) existing.setTelefon(utilizator.getTelefon());
                    return ResponseEntity.ok(utilizatorService.update(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    //Metoda DELETE
    @DeleteMapping("/utilizatori/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        utilizatorService.delete(id);
        return ResponseEntity.ok().build();
    }
}
