package com.api.gastos.meusgastos.domain.excption;

public class ResourceBadRequestException extends RuntimeException{
    
    public ResourceBadRequestException(String mensagem){
        super(mensagem);
    }
}
