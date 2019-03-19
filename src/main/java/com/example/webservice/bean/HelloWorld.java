package com.example.webservice.bean;

import javax.validation.constraints.NotNull;

public class HelloWorld {

    @NotNull(message = "message must no be null")
    private String message;
    @NotNull(message = "Id must not be null")
    private String id;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "message:"+message +" id:"+id;
    }
    
}