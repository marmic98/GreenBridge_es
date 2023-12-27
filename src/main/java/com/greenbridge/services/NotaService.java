package com.greenbridge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.greenbridge.entities.Nota;
import com.greenbridge.repositories.NotaRepository;

import java.util.List;

@Service
public class NotaService {

    @Autowired
    private NotaRepository notaRepository;
    
    NotaService(NotaRepository notaRepository){
        this.notaRepository = notaRepository;
    }

    public List<Nota> getAllNotes() {
        return notaRepository.findByOrderByIdDesc();
    }

    public void saveNote(Nota nota){
        notaRepository.save(nota);
    }
}
