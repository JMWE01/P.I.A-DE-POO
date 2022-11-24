package com.example.pia.Controller;

import com.example.pia.Entity.Citas;
import com.example.pia.Service.CitasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitasController {
    @Autowired
    private CitasService citasService;

    @GetMapping("/{id}")
    public ResponseEntity<Citas> updateUsuario(@PathVariable("id")Integer id) {
        return citasService.updateUsuario(id);
    }


    @GetMapping
    public List<Citas> listar(){
        return citasService.listar();
    }

    @PostMapping
    public Citas insertar(@RequestBody Citas emp){
        return citasService.insertar(emp);
    }

    @PutMapping
    public Citas actualizar(@RequestBody Citas emp){
        return citasService.actualizar(emp);
    }

    @DeleteMapping
    public void eliminar (@RequestBody Citas emp){
        citasService.eliminar(emp);
    }
}
