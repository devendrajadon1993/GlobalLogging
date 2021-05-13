package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = EmployeeServiceAspect.class)
@SpringBootApplication
public class LoggingAspectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggingAspectApplication.class, args);
	}

}
