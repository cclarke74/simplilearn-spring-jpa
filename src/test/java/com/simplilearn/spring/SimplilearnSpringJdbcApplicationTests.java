package com.simplilearn.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simplilearn.spring.controller.UserController;

@SpringBootTest
class SimplilearnSpringJdbcApplicationTests {

	@Autowired
	UserController userController;
	
	@Test
	void contextLoads() {
		assertThat(userController).isNotNull();
		
	}

}
