/**
 * File         DependencyInjector.java
 *
 * Created      1 Feb 2015, 22:37:10
 * Last Update  1 Feb 2015, 22:37:10
 * --------------------------------------------------
 * History:
 * $Log$
 *
 */
package com.example.demo;

import jakarta.faces.context.FacesContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;


/**
 * Performs dependency injection tasks. <br>
 * <br>
 * Copyright:   Copyright (c) 2015 <br>
 * Company:     b-next Engineering GmbH <br>
 * Creator:     Marek Holly <br>
 *
 * @author      $Author: dmitry.solonina $, $Date: 2023-08-11 17:01:05 +0200 (Fri, 11 Aug 2023) $
 * @version     $Revision: 6995 $
 */
public final class DependencyResolver
{
    /**
     * Populates given bean instance with declared dependencies.
     * 
     * @param bean bean to populate
     */
    public static void wireBean( Object bean )
    {
        if (FacesContext.getCurrentInstance() != null) {
            WebApplicationContext appContext = FacesContextUtils.getRequiredWebApplicationContext( FacesContext.getCurrentInstance() );
            appContext.getAutowireCapableBeanFactory().autowireBean( bean );
        }
        System.out.println(">>>> faces="+ FacesContext.getCurrentInstance());
    }

    private DependencyResolver()
    {
        //private constructor due to utility nature of this class
    }
}
