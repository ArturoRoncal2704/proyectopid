package com.cibertec.proypid.service.impl;

import com.cibertec.proypid.model.entity.UsuarioEntity;
import com.cibertec.proypid.repository.UsuarioRepository;
import com.cibertec.proypid.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public UsuarioEntity guardarUsuario(UsuarioEntity usuarioEntity) {
        return usuarioRepository.save(usuarioEntity);
    }

    @Override
    public UsuarioEntity buscarUsuarioPorId(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }


}
