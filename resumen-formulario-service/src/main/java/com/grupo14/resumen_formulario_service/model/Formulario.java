package com.grupo14.resumen_formulario_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "formularios")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // DENUNCIADO
    private String denunciadoNombre;
    private String denunciadoApellidoPaterno;
    private String denunciadoApellidoMaterno;
    private String denunciadoRut;
    private String denunciadoCargo;
    private String denunciadoArea;

    // REPRESENTANTE
    private String representanteNombre;
    private String representanteApellidoPaterno;
    private String representanteApellidoMaterno;
    private String representanteRut;
    private String representanteCargo;
    private String representanteArea;

    // VÍCTIMA
    private String victimaNombre;
    private String victimaApellidoPaterno;
    private String victimaApellidoMaterno;
    private String victimaRut;
    private String victimaCargo;
    private String victimaArea;

    // TESTIGO
    private String testigoNombre;
    private String testigoApellidoPaterno;
    private String testigoApellidoMaterno;
    private String testigoRut;
    private String testigoCargo;
    private String testigoArea;

    // TIPO DENUNCIA
    private String tiposSeleccionados;

    private Boolean relacionAsimetricaVictimaDepende;
    private Boolean relacionAsimetricaDenunciadoDepende;
    private Boolean relacionSimetricaMismaArea;
    private Boolean relacionSimetricaDistintaArea;

    // EVIDENCIAS
    private Boolean evidenciaExistente;
    private Boolean otrosAntecedentes;
    private Boolean informadaPreviamente;
    private Boolean cuentaConTestigos;

    // RELATO
    @Column(columnDefinition = "TEXT")
    private String relatoTexto;

    private String relatoAudioPath;

    private LocalDateTime fechaCreacion;

}
