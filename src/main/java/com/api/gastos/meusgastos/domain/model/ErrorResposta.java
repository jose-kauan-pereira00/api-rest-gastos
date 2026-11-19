package com.api.gastos.meusgastos.domain.model;

public class ErrorResposta {
    private  String dataHora;
    private Integer status;
    private  String titulo;
    private String menssagem;

    
    public ErrorResposta(String dataHora, Integer status, String titulo, String menssagem) {
        
        this.dataHora = dataHora;
        this.status = status;
        this.titulo = titulo;
        this.menssagem = menssagem;
    }

    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getMenssagem() {
        return menssagem;
    }
    public void setMenssagem(String menssagem) {
        this.menssagem = menssagem;
    }

    
}
