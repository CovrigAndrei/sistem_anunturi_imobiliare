package com.example.sistem_anunturi_imobiliare.controller;

import com.example.sistem_anunturi_imobiliare.model.Imobil;
import com.example.sistem_anunturi_imobiliare.service.ImobilService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ImobilController {
    private final ImobilService imobilService;

    public ImobilController(ImobilService imobilService) {
        this.imobilService = imobilService;
    }
    //Metoda GET
    @GetMapping("/imobile")
    public List<Imobil> getAll() {
        return imobilService.findAll();
    }

    //Metoda GET by Id
    @GetMapping("/imobile/{id}")
    public ResponseEntity<Imobil> getById(@PathVariable int id) {
        return imobilService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    //Metoda POST
    @PostMapping("/imobile")
    public Imobil create(@RequestBody Imobil imobil) {
        return imobilService.save(imobil);
    }

    //Metoda POST
    @PutMapping("/imobile/{id}")
    public ResponseEntity<Imobil> update(@PathVariable int id, @RequestBody Imobil imobil) {
        imobil.setId(id);
        return ResponseEntity.ok(imobilService.update(imobil));
    }

    //Metoda POST
    @PatchMapping("/imobile/{id}")
    public ResponseEntity<Imobil> partialUpdate(@PathVariable int id, @RequestBody Imobil imobil) {
        return imobilService.findById(id)
                .map(existing -> {
                    if (imobil.getTip() != null) existing.setTip(imobil.getTip());
                    if (imobil.getSuprafata() != 0) existing.setSuprafata(imobil.getSuprafata());
                    if (imobil.getAdresa() != null) existing.setAdresa(imobil.getAdresa());
                    return ResponseEntity.ok(imobilService.update(existing));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    //Metoda DELETE
    @DeleteMapping("/imobile/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        imobilService.delete(id);
        return ResponseEntity.ok().build();
    }
}