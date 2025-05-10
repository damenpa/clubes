package com.damenpa.clubes.controller;

import com.damenpa.clubes.dto.ConquistadorDto;
import com.damenpa.clubes.entity.Conquistador;
import com.damenpa.clubes.service.ClubesService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/conquistadores")
public class ClubesController {

    private final ClubesService clubesService;

    public ClubesController(ClubesService clubesService) {

        this.clubesService = clubesService;
    }

    @GetMapping
    public List<Conquistador> obtenerTodos() {

        return clubesService.obtenerTodos();
    }

    @PostMapping
    public Conquistador guardar(@RequestBody ConquistadorDto dto) {

        return clubesService.guardarDesdeDto(dto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {

        clubesService.eliminar(id);
    }

    @PutMapping("/{id}")
    public Conquistador actualizar(@PathVariable int id, @RequestBody ConquistadorDto conquistador) {
        return clubesService.actualizar(id, conquistador);
    }

}



