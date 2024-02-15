package com.gitprojects.contentcalendar.controller;

import com.gitprojects.contentcalendar.config.ContentCalendarProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {
    private final ContentCalendarProperties properties;

    public HomeController(ContentCalendarProperties properties) {
        this.properties = properties;
    }


    @GetMapping("/")
    public ContentCalendarProperties home(){
        return properties;

    }
}


//Good for single values but for more we need configuration properties
//    @Value("${cc.welcomeMessage: Default Welcome Message}")
//    private String welcomeMessage;
//
//    @Value("${cc.about}")
//    private String about;
//        return Map.of("welcomeMessage", welcomeMessage, "about", about);