package com.gitprojects.contentcalendar;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
//		ConfigurableApplicationContext context = SpringApplication.run(ContentCalendarApplication.class, args);
////		This prints out all the bean currently working
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

//		running the new bean
//		RestTemplate restTemplate = (RestTemplate) context.getBean(name:"restTemplate");

	}

}
