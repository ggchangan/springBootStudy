package com.ggchangan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
@SpringBootApplication
public class SpringBootStudyApplication {

	/*
	@Autowired
	private AuthorSettings authorSettings;
	*/

	/*
	@RequestMapping("/")
	String index() {
		return String.format("author's name is %s and age is %d", authorSettings.getName(), authorSettings.getAge());
	}
	*/

	public static void main(String[] args) {
		SpringApplication.run(SpringBootStudyApplication.class, args);
	}
}
