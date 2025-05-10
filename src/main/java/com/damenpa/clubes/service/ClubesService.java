package com.damenpa.clubes.service;
import com.damenpa.clubes.dto.ConquistadorDto;
import com.damenpa.clubes.entity.Clase;
import com.damenpa.clubes.entity.Iglesia;
import com.damenpa.clubes.repository.ClaseRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.damenpa.clubes.entity.Conquistador;
import com.damenpa.clubes.repository.ConquistadorRepository;
import com.damenpa.clubes.repository.IglesiaRepository;

@RequiredArgsConstructor
@Service

public class ClubesService {
    private final ConquistadorRepository conquistadorRepository;
    private final  IglesiaRepository iglesiaRepository;
    private final ClaseRepository claseRepository;
    private final ObjectMapper objectMapper;

    public Conquistador guardarDesdeDto(ConquistadorDto dto) {
        Conquistador conquistador = objectMapper.convertValue(dto, Conquistador.class);

        conquistador.setIglesia(iglesiaRepository.findById(dto.getIglesiaId())
                .orElseThrow(() -> new RuntimeException("Iglesia no encontrada")));
        conquistador.setClase(claseRepository.findById(dto.getClaseId())
                .orElseThrow(() -> new RuntimeException("Clase no encontrada")));

        return conquistadorRepository.save(conquistador);
    }

    public Conquistador actualizar(int id, ConquistadorDto dto) {
        return conquistadorRepository.findById(id)
                .map(conquistador -> {
                    conquistador.setNombre(dto.getNombre());
                    conquistador.setEdad(dto.getEdad());
                    conquistador.setCorreo(dto.getCorreo());
                    conquistador.setTelefono(dto.getTelefono());
                    conquistador.setApPaterno(dto.getApPaterno());
                    conquistador.setApMaterno(dto.getApMaterno());

                    Iglesia iglesia = iglesiaRepository.findById(dto.getIglesiaId())
                            .orElseThrow(() -> new RuntimeException("Iglesia no encontrada"));
                    Clase clase = claseRepository.findById(dto.getClaseId())
                            .orElseThrow(() -> new RuntimeException("Clase no encontrada"));

                    conquistador.setIglesia(iglesia);
                    conquistador.setClase(clase);

                    return conquistadorRepository.save(conquistador);
                })
                .orElseThrow(() -> new RuntimeException("Conquistador no encontrado con id: " + id));
    }

    public List<Conquistador> obtenerTodos() {
        return conquistadorRepository.findAll();
    }

    public void eliminar(int id) {
        conquistadorRepository.deleteById(id);
    }

}
