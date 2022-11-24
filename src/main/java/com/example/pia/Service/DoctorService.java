package com.example.pia.Service;

import com.example.pia.Entity.Doctors;
import com.example.pia.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctors insertar(Doctors emp) {
        return doctorRepository.save(emp);
    }
    public Doctors actualizar(Doctors emp){
        return doctorRepository.save(emp);
    }
    public ResponseEntity<Doctors> updateUsuario(Integer id) {
        Optional<Doctors> doctorData = doctorRepository.findById(id);
        if (doctorData.isPresent()) {
            return new ResponseEntity<>(doctorData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public List<Doctors> listar() {
        return doctorRepository.findAll();
    }
    public void eliminar(Doctors emp){
        doctorRepository.delete(emp);
    }
}
