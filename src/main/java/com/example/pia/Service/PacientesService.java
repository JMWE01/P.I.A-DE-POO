package com.example.pia.Service;

import com.example.pia.Entity.Pacientes;
import com.example.pia.Repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacientesService {
    @Autowired
    private PacientesRepository pacientesRepository;

    public Pacientes insertar(Pacientes emp) {
        return pacientesRepository.save(emp);
    }
    public Pacientes actualizar(Pacientes emp){
        return pacientesRepository.save(emp);
    }
    public ResponseEntity<Pacientes> updateUsuario(Integer id) {
        Optional<Pacientes> doctorData = pacientesRepository.findById(id);
        if (doctorData.isPresent()) {
            return new ResponseEntity<>(doctorData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public List<Pacientes> listar() {
        return pacientesRepository.findAll();
    }
    public void eliminar(Pacientes emp){
        pacientesRepository.delete(emp);
    }
}
