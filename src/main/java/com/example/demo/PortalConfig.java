/**
 * File         PortalConfig.java
 *
 * Created      30 Jan 2015, 17:59:54
 * Last Update  30 Jan 2015, 17:59:54
 * --------------------------------------------------
 * History:
 * $Log$
 *
 */
package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Spring configuration for portal project. <br>
 * <br>
 * Copyright:   Copyright (c) 2015 <br>
 * Company:     b-next Engineering GmbH <br>
 * Creator:     Marek Holly <br>
 *
 * @author      $Author: pbodnar $, $Date: 2015-12-01 17:00:26 +0100 (Tue, 01 Dec 2015) $
 * @version     $Revision: 3052 $
 */
@Configuration
public class PortalConfig
{

    // IMPORTANT: If we put @Import to the outer class, imported @PropertySource-s would be used in wrong order - see https://jira.spring.io/browse/SPR-10409
    @Import( { FrameworkModuleConfig.class} )
    //@ImportResource( "classpath:beans-webapp.xml" )
    static class InnerConfiguration
    {
        // unused
    }

}
