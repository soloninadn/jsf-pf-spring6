package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.util.Date;

@Named
@RequestScoped
public class Hello {

    private String name;
    private String message;
    private Date validFrom;

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

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public String getMessage() {
        return message;
    }

    @PostConstruct
    private void initInternal()
    {
        System.out.println("!!!!!initInternal Hello");;
    }
}
