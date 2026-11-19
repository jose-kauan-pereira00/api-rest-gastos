package com.api.gastos.meusgastos.handler;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.gastos.meusgastos.common.ConversorData;
import com.api.gastos.meusgastos.domain.excption.ResourceBadRequestException;
import com.api.gastos.meusgastos.domain.excption.ResourceNotFoundException;
import com.api.gastos.meusgastos.domain.model.ErrorResposta;

@ControllerAdvice 
public class RestExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ErrorResposta> handleResourceResponse(ResourceNotFoundException ex){

        String dataHora = ConversorData.converterDate(new Date(0));

        ErrorResposta erro = new ErrorResposta(dataHora, 400, "Not Found", ex.getMessage());

        return new ResponseEntity<ErrorResposta>(erro, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ResourceBadRequestException.class)
    public ResponseEntity<ErrorResposta> handleResourceBadRequest(ResourceNotFoundException ex){

        String dataHora = ConversorData.converterDate(new Date(0));

        ErrorResposta erro = new ErrorResposta(dataHora, HttpStatus.BAD_REQUEST.value(), "Bad Request", ex.getMessage());

        return new ResponseEntity<ErrorResposta>(erro, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResposta> handlerExceptionCommum(ResourceNotFoundException ex){

        String dataHora = ConversorData.converterDate(new Date(0));

        ErrorResposta erro = new ErrorResposta(dataHora, HttpStatus.INTERNAL_SERVER_ERROR.value(), "Bad Request", ex.getMessage());

        return new ResponseEntity<ErrorResposta>(erro, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
