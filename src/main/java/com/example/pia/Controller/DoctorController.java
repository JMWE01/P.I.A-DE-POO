package com.example.pia.Controller;

import com.example.pia.Entity.Doctors;
import com.example.pia.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctores")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/{id}")
    public ResponseEntity<Doctors> updateUsuario(@PathVariable("id")Integer id) {
        return doctorService.updateUsuario(id);
    }


    @GetMapping
    public List<Doctors> listar(){
        return doctorService.listar();
    }

    @PostMapping
    public Doctors insertar(@RequestBody Doctors emp){
        return doctorService.insertar(emp);
    }

    @PutMapping
    public Doctors actualizar(@RequestBody Doctors emp){
        return doctorService.actualizar(emp);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Doctors emp){
        doctorService.eliminar(emp);
    }
}
