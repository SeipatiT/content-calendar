package com.gitprojects.contentcalendar.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

//@Controller


//To run this only in production and not dev we define the profile
//@Profile("!dev")
//@Component
public class DataLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello from the command line runner");
    }
}
