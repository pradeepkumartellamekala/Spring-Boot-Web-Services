package net.javaguides.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class EmailException extends RuntimeException{
    private String message;
    EmailException(String message){
        super(message);
        this.message = message;
    }

}
