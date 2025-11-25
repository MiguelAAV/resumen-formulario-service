package com.grupo14.resumen_formulario_service.service;

import com.grupo14.resumen_formulario_service.dto.FormularioHistorialDto;
import com.grupo14.resumen_formulario_service.model.Formulario;
import com.grupo14.resumen_formulario_service.repository.FormularioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialFormularioService {

    private final FormularioRepository repo;

    public HistorialFormularioService(FormularioRepository repo) {
        this.repo = repo;
    }


     // Devuelve la lista de formularios en formato "historial" (DTO).

    public List<FormularioHistorialDto> obtenerHistorial() {
        return repo.findAll().stream()
                .map(this::mapToHistorial)
                .toList();
    }


     // Elimina un formulario por su ID.
     // @return true si se eliminó, false si no existía.

    public boolean eliminarPorId(Integer id) {
        if (!repo.existsById(id)) {
            return false;
        }
        repo.deleteById(id);
        return true;
    }


    // Mapea la Entity Formulario al DTO usado por la pantalla de Historial.

    private FormularioHistorialDto mapToHistorial(Formulario f) {
        return new FormularioHistorialDto(
                f.getId(),

                // Denunciado
                nullToEmpty(f.getDenunciadoNombre()),
                nullToEmpty(f.getDenunciadoApellidoPaterno()),
                nullToEmpty(f.getDenunciadoApellidoMaterno()),
                nullToEmpty(f.getDenunciadoRut()),
                nullToEmpty(f.getDenunciadoCargo()),
                nullToEmpty(f.getDenunciadoArea()),

                // Representante
                nullToEmpty(f.getRepresentanteNombre()),
                nullToEmpty(f.getRepresentanteRut()),

                // Tipo(s) de denuncia (string completo)
                nullToEmpty(f.getTiposSeleccionados()),

                // Fecha de creación (puede ser null si los registros son viejos)
                f.getFechaCreacion()
        );
    }


    // Evita NullPointer: convierte null en string vacío.

    private String nullToEmpty(String value) {
        return value == null ? "" : value;
    }
}
