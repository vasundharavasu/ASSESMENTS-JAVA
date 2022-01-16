package com.org.gen;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.gen")
public class AppConfig {

	@Bean
	public Department getDepartment() {
		return new DepartmentImpl();
	}
}
