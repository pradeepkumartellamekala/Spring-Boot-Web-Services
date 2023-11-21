package net.javaguides.springboot.exception;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResponseNotFoundException extends RuntimeException{
    private String resourceName;
    private String fieldName;
    private int fieldValue;
    public ResponseNotFoundException(String resourceName, String fieldName, int fieldValue){
        super(String.format("%s is not found with %s : '%s'", resourceName, fieldName, fieldValue));
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
        this.resourceName = resourceName;
    }
}
