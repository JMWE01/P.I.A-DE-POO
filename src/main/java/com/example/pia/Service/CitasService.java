package com.example.pia.Service;

import com.example.pia.Entity.Citas;
import com.example.pia.Repository.CitasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CitasService {
    @Autowired
    private CitasRepository citasRepository;

    public Citas insertar(Citas emp) {
        return citasRepository.save(emp);
    }
    public Citas actualizar(Citas emp){
        return citasRepository.save(emp);
    }
    public ResponseEntity<Citas> updateUsuario(Integer id) {
        Optional<Citas> doctorData = citasRepository.findById(id);
        if (doctorData.isPresent()) {
            return new ResponseEntity<>(doctorData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    public List<Citas> listar() {
        return citasRepository.findAll();
    }
    public void eliminar(Citas emp){
        citasRepository.delete(emp);
    }
}
