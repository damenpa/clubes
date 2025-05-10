package com.damenpa.clubes.dto;

import com.damenpa.clubes.entity.Clase;
import lombok.Data;

@Data
public class ConquistadorDto {
    private String nombre;
    private int edad;
    private String correo;
    private String telefono;
    private String apPaterno;
    private String apMaterno;
    private int claseId;
    private int iglesiaId;
}
