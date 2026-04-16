package com.example.examen1ro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.examen1ro.model.Mascota;

public interface MascotaRepository extends JpaRepository<Mascota, Long> {
}