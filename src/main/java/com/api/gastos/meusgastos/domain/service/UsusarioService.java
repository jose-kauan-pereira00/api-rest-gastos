package com.api.gastos.meusgastos.domain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        List<UsuarioResponseDTO> usuarioResponseDTOs = new ArrayList<>();

        for (Usuario usu : usuarios) {
            UsuarioResponseDTO dto = mapper.map(usu, UsuarioResponseDTO.class);
            usuarioResponseDTOs.add(dto);

        }

        return usuarioResponseDTOs;
    }

    @Override
    public UsuarioResponseDTO obterPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);

        if(usuario.isEmpty()){
             
        }

        return mapper.map(usuario.get(), UsuarioResponseDTO.class);
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
