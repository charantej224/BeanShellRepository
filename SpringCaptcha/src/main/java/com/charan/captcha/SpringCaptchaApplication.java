package com.charan.captcha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.charan")
public class SpringCaptchaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCaptchaApplication.class, args);
	}
}
