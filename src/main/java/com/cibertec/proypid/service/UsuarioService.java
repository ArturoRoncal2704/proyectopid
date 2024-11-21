package com.cibertec.proypid.service;

import com.cibertec.proypid.model.entity.UsuarioEntity;

public interface UsuarioService {

    public UsuarioEntity guardarUsuario (UsuarioEntity usuarioEntity);

    UsuarioEntity buscarUsuarioPorId(Integer id);

}
