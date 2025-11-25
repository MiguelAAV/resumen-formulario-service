package com.grupo14.resumen_formulario_service.repository;

import com.grupo14.resumen_formulario_service.model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Integer> {
}
