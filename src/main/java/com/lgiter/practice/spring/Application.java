package com.lgiter.practice.spring;

import com.lixiang.umr.starter.anno.EnableMultilingual;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableMultilingual
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
