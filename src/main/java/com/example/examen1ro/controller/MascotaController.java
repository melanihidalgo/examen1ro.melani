package com.example.examen1ro.controller;

import com.example.examen1ro.model.Mascota;
import com.example.examen1ro.repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaRepository repo;

    @GetMapping
    public List<Mascota> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Mascota guardar(@RequestBody Mascota mascota) {
        return repo.save(mascota);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}