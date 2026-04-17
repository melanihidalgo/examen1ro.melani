package com.example.examen1ro.controller;

import com.example.examen1ro.model.Dueno;
import com.example.examen1ro.repository.DuenoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/duenos")
public class DuenoController {

    @Autowired
    private DuenoRepository duenoRepository;

    @GetMapping
    public List<Dueno> listar() {
        return duenoRepository.findAll();
    }

    @PostMapping
    public Dueno guardar(@RequestBody Dueno dueno) {
        return duenoRepository.save(dueno);
    }
}