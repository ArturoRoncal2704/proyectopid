package com.cibertec.proypid.controller;

import com.cibertec.proypid.model.entity.UsuarioEntity;
import com.cibertec.proypid.service.UsuarioService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("usuario")
   public UsuarioEntity guardarUsuario(@RequestBody UsuarioEntity usuarioEntity){
        return this.usuarioService.guardarUsuario(usuarioEntity);
    }

    @GetMapping("usuario/{id}")
    public ResponseEntity<UsuarioEntity> buscarUsuarioPorId(@PathVariable Integer id) {
        UsuarioEntity usuario = usuarioService.buscarUsuarioPorId(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {

            return ResponseEntity.notFound().build();
        }
    }
}
