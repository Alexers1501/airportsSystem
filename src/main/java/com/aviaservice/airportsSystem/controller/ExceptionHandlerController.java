package com.aviaservice.airportsSystem.controller;

import com.aviaservice.airportsSystem.dto.ErrorNotification;
import com.aviaservice.airportsSystem.exception.NotFoundException;
import com.aviaservice.airportsSystem.exception.ValidationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(ValidationException.class)
    public ErrorNotification handlerValidationException(ValidationException e){
        ErrorNotification errorNotification = new ErrorNotification();
        errorNotification.setErrorMessage(e.getMessage());
        return errorNotification;
    }

    @ExceptionHandler(RuntimeException.class)
    public ErrorNotification handlerRuntimeException(RuntimeException e){
        ErrorNotification errorNotification = new ErrorNotification();
        errorNotification.setErrorMessage("Произошла техническая ошибка. Обратитесь в тех. поддержку");
        return errorNotification;
    }

    @ExceptionHandler(NotFoundException.class)
    public ErrorNotification handlerNotFoundException(NotFoundException e){
        ErrorNotification errorNotification = new ErrorNotification();
        errorNotification.setErrorMessage(e.getMessage());
        return errorNotification;
    }
}
