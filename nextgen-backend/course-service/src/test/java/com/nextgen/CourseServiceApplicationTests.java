package com.nextgen;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(ContainersConfiguration.class)
@SpringBootTest
class CourseServiceApplicationTests {

	@Test
	void contextLoads() {
	}

}
