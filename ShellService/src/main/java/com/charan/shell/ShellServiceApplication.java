package com.charan.shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.charan")
public class ShellServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShellServiceApplication.class, args);
	}

}

