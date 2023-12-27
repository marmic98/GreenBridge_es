package com.greenbridge.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import com.greenbridge.entities.Nota;
import com.greenbridge.services.NotaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class RestNotaController {
    @Autowired
    private NotaService notaService;

    @PostMapping("/create-note")
    public ResponseEntity<Boolean> createnote(@RequestBody Nota nota){
        notaService.saveNote(nota);
        return new ResponseEntity<Boolean>(HttpStatus.CREATED);
    }

    
}