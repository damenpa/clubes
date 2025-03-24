package com.damenpa.clubes.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "directiva")
public class Directiva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String correo;
    private String telefono;
    private String apPaterno;
    private String apMaterno;

    @ManyToOne
    @JoinColumn(name = "tipo_id")
    private TipoDirectiva tipo;

    @ManyToOne
    @JoinColumn(name = "iglesia_id", referencedColumnName = "id")
    private Iglesia iglesia;
}

