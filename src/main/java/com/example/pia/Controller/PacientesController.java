package com.example.pia.Controller;

import com.example.pia.Entity.Pacientes;
import com.example.pia.Service.PacientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacientesController {
    @Autowired
    private PacientesService pacientesService;

    @GetMapping("/{id}")
    public ResponseEntity<Pacientes> updateUsuario(@PathVariable("id")Integer id) {
        return pacientesService.updateUsuario(id);
    }


    @GetMapping
    public List<Pacientes> listar(){
        return pacientesService.listar();
    }

    @PostMapping
    public Pacientes insertar(@RequestBody Pacientes emp){
        return pacientesService.insertar(emp);
    }

    @PutMapping
    public Pacientes actualizar(@RequestBody Pacientes emp){
        return pacientesService.actualizar(emp);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Pacientes emp){
        pacientesService.eliminar(emp);
    }
}
