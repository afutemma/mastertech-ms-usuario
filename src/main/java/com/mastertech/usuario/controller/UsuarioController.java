package com.mastertech.usuario.controller;

import ch.qos.logback.core.net.server.Client;
import com.mastertech.usuario.model.Usuario;
import com.mastertech.usuario.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsuarioController{

    @Autowired
    private UsuarioService service;

    @PostMapping("/cliente")
    public ResponseEntity postUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(service.salvar(usuario));
    }


    @GetMapping("/cliente/{id}")
    public ResponseEntity getUsuario(@PathVariable int id) {
        return ResponseEntity.ok(service.buscarPorId(id));
    }
}
