package com.api.gastos.meusgastos.domain.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class Usuario implements UserDetails {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUsuario")
    private Long id;

    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String senha;

    @Column(columnDefinition = "TEXT")
    private String foto;

    @Column(nullable = false)
    private Date dataCadastro;

    private Date dataInativacao;

    @OneToMany(mappedBy = "usuario")
    private  List<Titulo> titulos;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAuthorities'");
    }

    @Override
    public @Nullable String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.email;
    }

    /**
     * Getters and Setters
     *
    */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Date getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public Date getDataInativacao() {
        return dataInativacao;
    }
    public void setDataInativacao(Date dataInativacao) {
        this.dataInativacao = dataInativacao;
    }
    public List<Titulo> getTitulos() {
        return titulos;
    }
    public void setTitulos(List<Titulo> titulos) {
        this.titulos = titulos;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}
