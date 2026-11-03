package com.validation.controller;


import com.validation.dto.EventoDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @PostMapping
    public ResponseEntity<EventoDTO> criar(@Valid @RequestBody EventoDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }
}
