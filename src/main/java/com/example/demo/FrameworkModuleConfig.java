/**
 * File         FrameworkConfig.java
 *
 * Created      10 Feb 2015, 08:47:11
 * Last Update  10 Feb 2015, 08:47:11
 * --------------------------------------------------
 * History:
 * $Log$
 *
 */
package com.example.demo;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;


/**
 * Spring configuration specific for compliance-framework module <br>
 * <br>
 * Copyright:   Copyright (c) 2015 <br>
 * Company:     b-next Engineering GmbH <br>
 * Creator:     Marek Holly <br>
 *
 * @author      $Author:$, $Date:$
 * @version     $Revision:$
 */
@Configuration
//@ComponentScan
//@ComponentScan( basePackages = "com.example.demo" )
public class FrameworkModuleConfig
{

    @Resource
    private Environment env;

    /**
     * Register property configurer ({@code BeanFactoryPostProcessor}) in order to access property values using {@link Value} 
     * annotation. Note that {@code static} is important as it prevents interfering with annotations processing. For more 
     * details please see javadoc of {@link Bean} annotation.
     * 
     * @return instance of {@link PropertySourcesPlaceholderConfigurer}
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer()
    {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
