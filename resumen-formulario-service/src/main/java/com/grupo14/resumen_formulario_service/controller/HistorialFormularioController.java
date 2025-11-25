package com.grupo14.resumen_formulario_service.controller;

import com.grupo14.resumen_formulario_service.dto.FormularioHistorialDto;
import com.grupo14.resumen_formulario_service.service.HistorialFormularioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historial")
@CrossOrigin(origins = "*")
public class HistorialFormularioController {

    private final HistorialFormularioService service;

    public HistorialFormularioController(HistorialFormularioService service) {
        this.service = service;
    }

    @GetMapping
    public List<FormularioHistorialDto> obtenerHistorial() {
        return service.obtenerHistorial();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        boolean eliminado = service.eliminarPorId(id);
        if (!eliminado) return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }
}
