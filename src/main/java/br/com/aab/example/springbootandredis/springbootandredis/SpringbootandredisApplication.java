package br.com.aab.example.springbootandredis.springbootandredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootandredisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootandredisApplication.class, args);
	}

}
