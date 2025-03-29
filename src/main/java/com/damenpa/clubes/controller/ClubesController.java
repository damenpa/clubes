package com.damenpa.clubes.controller;

import com.damenpa.clubes.entity.Conquistador;
import com.damenpa.clubes.service.ClubesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.geom.QuadCurve2D;
import java.util.List;

@RestController
@RequestMapping("/conquistadores")
public class ClubesController {

    @Autowired
    private final ClubesService clubesService;

    public ClubesController(ClubesService clubesService) {
        this.clubesService = clubesService;
    }

    @GetMapping
    public List<Conquistador> obtenerTodos() {
        return clubesService.obtenerTodos();
    }

    @PostMapping
    public Conquistador guardar(@RequestBody Conquistador conquistador) {
        return clubesService.guardar(conquistador);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        clubesService.eliminar(id);
    }
}



