package com.nextgen;

import org.springframework.boot.SpringApplication;

public class TestCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CourseServiceApplication::main)
				.with(ContainersConfiguration.class)
				.run(args);
	}

}
