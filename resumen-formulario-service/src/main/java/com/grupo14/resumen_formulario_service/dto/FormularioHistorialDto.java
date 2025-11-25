package com.grupo14.resumen_formulario_service.dto;

import java.time.LocalDateTime;

public class FormularioHistorialDto {

    private Integer id;

    // Denunciado
    private String denunciadoNombre;
    private String denunciadoApellidoPaterno;
    private String denunciadoApellidoMaterno;
    private String denunciadoRut;
    private String denunciadoCargo;
    private String denunciadoArea;

    // Representante
    private String representanteNombre;
    private String representanteRut;

    // Tipo de denuncia (string completo tal como hoy)
    private String tiposSeleccionados;

    // Nueva info
    private LocalDateTime fechaCreacion;

    public FormularioHistorialDto() {}

    public FormularioHistorialDto(Integer id,
                                  String denunciadoNombre,
                                  String denunciadoApellidoPaterno,
                                  String denunciadoApellidoMaterno,
                                  String denunciadoRut,
                                  String denunciadoCargo,
                                  String denunciadoArea,
                                  String representanteNombre,
                                  String representanteRut,
                                  String tiposSeleccionados,
                                  LocalDateTime fechaCreacion) {
        this.id = id;
        this.denunciadoNombre = denunciadoNombre;
        this.denunciadoApellidoPaterno = denunciadoApellidoPaterno;
        this.denunciadoApellidoMaterno = denunciadoApellidoMaterno;
        this.denunciadoRut = denunciadoRut;
        this.denunciadoCargo = denunciadoCargo;
        this.denunciadoArea = denunciadoArea;
        this.representanteNombre = representanteNombre;
        this.representanteRut = representanteRut;
        this.tiposSeleccionados = tiposSeleccionados;
        this.fechaCreacion = fechaCreacion;
    }

    // getters y setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenunciadoNombre() {
        return denunciadoNombre;
    }

    public void setDenunciadoNombre(String denunciadoNombre) {
        this.denunciadoNombre = denunciadoNombre;
    }

    public String getDenunciadoApellidoPaterno() {
        return denunciadoApellidoPaterno;
    }

    public void setDenunciadoApellidoPaterno(String denunciadoApellidoPaterno) {
        this.denunciadoApellidoPaterno = denunciadoApellidoPaterno;
    }

    public String getDenunciadoApellidoMaterno() {
        return denunciadoApellidoMaterno;
    }

    public void setDenunciadoApellidoMaterno(String denunciadoApellidoMaterno) {
        this.denunciadoApellidoMaterno = denunciadoApellidoMaterno;
    }

    public String getDenunciadoRut() {
        return denunciadoRut;
    }

    public void setDenunciadoRut(String denunciadoRut) {
        this.denunciadoRut = denunciadoRut;
    }

    public String getDenunciadoCargo() {
        return denunciadoCargo;
    }

    public void setDenunciadoCargo(String denunciadoCargo) {
        this.denunciadoCargo = denunciadoCargo;
    }

    public String getDenunciadoArea() {
        return denunciadoArea;
    }

    public void setDenunciadoArea(String denunciadoArea) {
        this.denunciadoArea = denunciadoArea;
    }

    public String getRepresentanteNombre() {
        return representanteNombre;
    }

    public void setRepresentanteNombre(String representanteNombre) {
        this.representanteNombre = representanteNombre;
    }

    public String getRepresentanteRut() {
        return representanteRut;
    }

    public void setRepresentanteRut(String representanteRut) {
        this.representanteRut = representanteRut;
    }

    public String getTiposSeleccionados() {
        return tiposSeleccionados;
    }

    public void setTiposSeleccionados(String tiposSeleccionados) {
        this.tiposSeleccionados = tiposSeleccionados;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
