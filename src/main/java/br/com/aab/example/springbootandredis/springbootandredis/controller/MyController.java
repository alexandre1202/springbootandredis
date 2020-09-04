package br.com.aab.example.springbootandredis.springbootandredis.controller;

import java.time.LocalDateTime;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
  @GetMapping(value = "/redis")
  @Cacheable(value = "mycache")
  public String getRedis() {
    String response = "\nMy First Redis Application with Spring Boot " + LocalDateTime.now() + "\n";
    return response;
  }
}
