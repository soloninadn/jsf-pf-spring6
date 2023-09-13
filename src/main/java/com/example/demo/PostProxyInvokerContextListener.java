package com.example.demo;

import jakarta.faces.application.Application;
import jakarta.faces.event.AbortProcessingException;
import jakarta.faces.event.PostConstructApplicationEvent;
import jakarta.faces.event.PreDestroyApplicationEvent;
import jakarta.faces.event.SystemEvent;
import jakarta.faces.event.SystemEventListener;


public class PostProxyInvokerContextListener implements SystemEventListener {

    @Override
    public void processEvent(SystemEvent event) throws AbortProcessingException {
        if (event instanceof PostConstructApplicationEvent){
            System.out.println("post initialize application");
            //DependencyResolver.wireBean( this );
        } else if (event instanceof PreDestroyApplicationEvent){
            System.out.println("pre destroy application");
        }
    }

    @Override
    public boolean isListenerForSource(Object source) {
        return source instanceof Application;
    }

}
