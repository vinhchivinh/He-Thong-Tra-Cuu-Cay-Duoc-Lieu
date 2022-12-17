package com.tracuucayduoclieu.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.tracuucayduoclieu")
@EnableJpaRepositories("com.tracuucayduoclieu.Repository")
@EntityScan("com.tracuucayduoclieu.Entity")
public class ComApplication {
	public static void main(String[] args) {
		SpringApplication.run(ComApplication.class, args);
	}
}
