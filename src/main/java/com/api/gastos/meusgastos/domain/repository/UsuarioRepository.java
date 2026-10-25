package com.api.gastos.meusgastos.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gastos.meusgastos.domain.model.Usuario;
import java.util.List;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{  
    List<Usuario> findByEmail(String email);
}
