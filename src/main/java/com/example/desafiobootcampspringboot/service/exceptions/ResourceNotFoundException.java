package com.example.desafiobootcampspringboot.service.exceptions;

import java.io.Serializable;

public class ResourceNotFoundException extends RuntimeException implements Serializable {

    private final static long serialVersionUID = 1l;

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
