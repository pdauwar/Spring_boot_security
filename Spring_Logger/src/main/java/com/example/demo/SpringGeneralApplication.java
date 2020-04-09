package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class SpringGeneralApplication {
   private static final Logger logger = LoggerFactory.getLogger(SpringGeneralApplication.class);
   
   public static void main(String[] args) {
      logger.info("this is a info message");
      logger.warn("this is a warn message");
      logger.error("this is a error message");
      SpringApplication.run(SpringGeneralApplication.class, args);
   }
}