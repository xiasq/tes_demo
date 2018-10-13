package com.hyjf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class EnvApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvApplication.class, args);
	}

	@RequestMapping("/index")
	public String index(){
		return "index";
	}

	@RequestMapping("/env")
	public String env(){
		return "env";
	}

	@RequestMapping("/new-env")
	public String newenv(){
		return "new-env";
	}

	@RequestMapping("/log")
	public String log(){
		return "log";
	}

	@RequestMapping("/version")
	public String version(){
		return "version";
	}
}
