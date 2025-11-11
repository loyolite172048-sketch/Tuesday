package com.viraj.catelogService;

import org.springframework.boot.SpringApplication;

public class TestCatelogServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(CatelogServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
