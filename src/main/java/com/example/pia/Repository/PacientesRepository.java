package com.example.pia.Repository;

import com.example.pia.Entity.Pacientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacientesRepository extends JpaRepository<Pacientes, Integer> {
}
