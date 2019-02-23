package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ConfigurationProperties
@EnableAutoConfiguration
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DemoApplication
{
	Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	@RequestMapping("/resource")
	public Map<String, Object> home(WebRequest request)
	{
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("id", UUID.randomUUID().toString());
		model.put("content", "Hello World");
		logger.info("session: " + request.getSessionId() + " user: " + request.getRemoteUser());
		return model;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(DemoApplication.class, args);
	}

}