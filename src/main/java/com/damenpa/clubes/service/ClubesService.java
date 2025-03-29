package com.damenpa.clubes.service;
import org.springframework.stereotype.Service;
import java.util.List;
import com.damenpa.clubes.entity.Conquistador;
import com.damenpa.clubes.repository.ClubesRepository;

@Service
public class ClubesService {
    private final ClubesRepository clubesRepository;

    public ClubesService(ClubesRepository clubesRepository) {
        this.clubesRepository = clubesRepository;
    }

    public List<Conquistador> obtenerTodos() {
        return clubesRepository.findAll();
    }

    public Conquistador guardar(Conquistador conquistador) {
        return clubesRepository.save(conquistador);
    }

    public void eliminar(int id) {
        clubesRepository.deleteById(id);
    }
}
