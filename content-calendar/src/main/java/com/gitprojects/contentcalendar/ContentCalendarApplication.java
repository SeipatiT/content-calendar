package com.gitprojects.contentcalendar;

import com.gitprojects.contentcalendar.model.Content;
import com.gitprojects.contentcalendar.model.Status;
import com.gitprojects.contentcalendar.model.Type;
import com.gitprojects.contentcalendar.repository.ContentRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDateTime;
import java.util.Arrays;

@SpringBootApplication
public class ContentCalendarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContentCalendarApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args ->
				//Insert data into database
		{
			Content content = new Content(null,
					"Bootstrapping",
					"This is an example of bootstrapping",
					Status.PUBLISHED,
					Type.COURSE,
					LocalDateTime.now(),
					null,
					"http://www.google.com");
			repository.save(content);
		};
	}











//		ConfigurableApplicationContext context = SpringApplication.run(ContentCalendarApplication.class, args);
////		This prints out all the bean currently working
//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

//		running the new bean
//		RestTemplate restTemplate = (RestTemplate) context.getBean(name:"restTemplate");



}
