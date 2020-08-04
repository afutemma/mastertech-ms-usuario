package com.mastertech.usuario.service;

import com.mastertech.usuario.model.Usuario;
import com.mastertech.usuario.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario){
        return repository.save(usuario);
    }

    public Optional<Usuario> buscarPorId(int id){
        return repository.findById(id);
    }
}
