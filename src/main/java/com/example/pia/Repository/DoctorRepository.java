package com.example.pia.Repository;

import com.example.pia.Entity.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctors, Integer> {
}
