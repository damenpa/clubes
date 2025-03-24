package com.damenpa.clubes.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "puntaje")
public class Puntaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "conquistador_id")
    private Conquistador conquistador;

    @ManyToOne
    @JoinColumn(name = "actividad_id")
    private Actividad actividad;

    private int puntaje;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "asignado_por")
    private Directiva asignadoPor;
}

