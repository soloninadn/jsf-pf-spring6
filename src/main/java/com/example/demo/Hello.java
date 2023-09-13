package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Hello {

    private String name;
    private String message;

    public void createMessage() {
        message = "Hello, " + name + "!";
        //initInternal();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    @PostConstruct
    private final void initInternal()
    {
        System.out.println("!!!!!initInternal Hello");;
    }
}
