package com.mtwelve.springbootmtnthree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class SpringbootmtnthreeApplication {
	
	@RequestMapping("/")
	@ResponseBody
	public String helloWorld () {
		return "HELLO WORLD!!!";
	}
	
	@RequestMapping("/{name}")
	@ResponseBody
	public String helloName (@PathVariable("name") String name) {
		return "Hello, " + name + "!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmtnthreeApplication.class, args);
	}

}
