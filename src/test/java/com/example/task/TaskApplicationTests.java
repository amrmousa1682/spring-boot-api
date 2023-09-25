package com.example.task;

import com.example.task.controllers.CategoryController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class TaskApplicationTests {

	@Autowired
	private CategoryController categoryController;

	@Test
	void contextLoads() {
		assertThat(categoryController).isNotNull();
	}

}
