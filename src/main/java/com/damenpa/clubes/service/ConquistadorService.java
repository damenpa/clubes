package com.damenpa.clubes.service;
import org.springframework.stereotype.Service;
import java.util.List;
import com.damenpa.clubes.entity.Conquistador;
import com.damenpa.clubes.repository.ConquistadorRepository;

@Service
public class ConquistadorService {
    private final ConquistadorRepository conquistadorRepository;

    public ConquistadorService(ConquistadorRepository conquistadorRepository) {
        this.conquistadorRepository = conquistadorRepository;
    }

    public List<Conquistador> obtenerTodos() {
        return conquistadorRepository.findAll();
    }

    public Conquistador guardar(Conquistador conquistador) {
        return conquistadorRepository.save(conquistador);
    }

    public void eliminar(int id) {
        conquistadorRepository.deleteById(id);
    }
}
