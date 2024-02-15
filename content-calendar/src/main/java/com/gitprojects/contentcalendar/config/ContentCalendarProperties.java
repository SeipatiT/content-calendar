package com.gitprojects.contentcalendar.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "cc")
public record ContentCalendarProperties(String welcomeMessage, String about){
//    public ContentCalendarProperties {
//        if (welcomeMessage == null) {
//            welcomeMessage = "Default Welcome Message";
//        }
//    }
}
