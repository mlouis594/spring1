package com.example.spring1;

import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.spring1.run.Location;
import com.example.spring1.run.Run;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class Application {

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		/**
		 * ConfigurableApplicationContext context =
		 * SpringApplication.run(Application.class, args);
		 * 
		 * // bean is an instance of a class
		 * // do this opposed to using the new keyword
		 * WelcomeMessage welcomeMessage = (WelcomeMessage)
		 * context.getBean("welcomeMessage");
		 * System.out.println(welcomeMessage);
		 */
		SpringApplication.run(Application.class, args);
		log.info("Something has changed");

	}

	// command line runner is something that runs after the application has started
	// and after the app context has been created
	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5,
					Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}
