package com.compucafe.springsandbox;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.hateoas.config.EnableHypermediaSupport;

import javax.annotation.PostConstruct;

@Slf4j
@SpringBootApplication
@EnableHypermediaSupport(type = {})
public class SpringSandboxApplication {

	@Autowired
	ApplicationContext ctx;

	@PostConstruct
	public void init() {
		log.info("management.endpoints.enabled-by-default: " + ctx.getEnvironment().getProperty("management.endpoints.enabled-by-default"));
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringSandboxApplication.class);
		app.addListeners(new PropertiesLogger());
		app.run(args);
	}

}
