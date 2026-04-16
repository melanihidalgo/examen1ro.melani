package com.example.examen1ro.controller;

import com.example.examen1ro.model.Mascota;
import com.example.examen1ro.repository.MascotaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    private final MascotaRepository repo;

    public MascotaController(MascotaRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Mascota crear(@RequestBody Mascota mascota) {
        return repo.save(mascota);
    }

    @GetMapping
    public List<Mascota> listar() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Mascota obtener(@PathVariable Long id) {
        return repo.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Mascota actualizar(@PathVariable Long id, @RequestBody Mascota mascota) {
        mascota.setId(id);
        return repo.save(mascota);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}