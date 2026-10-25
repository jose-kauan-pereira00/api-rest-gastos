package com.api.gastos.meusgastos.domain.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.api.gastos.meusgastos.domain.dto.usuario.UsuarioRequestDTO;
import com.api.gastos.meusgastos.domain.dto.usuario.UsuarioResponseDTO;
import com.api.gastos.meusgastos.domain.model.Usuario;
import com.api.gastos.meusgastos.domain.repository.UsuarioRepository;

public class UsusarioService implements  ICRUDService<UsuarioRequestDTO, UsuarioResponseDTO>{

    @Autowired 
    private UsuarioRepository usuarioRepository;

    @Autowired 
    private ModelMapper mapper;



    @Override
    public List<UsuarioResponseDTO> obterTodos() {

        List<Usuario> usuarios = usuarioRepository.findAll();

        
    }

    @Override
    public UsuarioResponseDTO obterPorId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obterPorId'");
    }

    @Override
    public UsuarioResponseDTO cadastrar(UsuarioRequestDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
    }

    @Override
    public UsuarioResponseDTO atualizar(Long id, UsuarioRequestDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizar'");
    }

    @Override
    public void deletar(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletar'");
    }

    
}
