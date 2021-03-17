package com.mtwelve.springbootmtntwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@SpringBootApplication
public class SpringBootMtntwoApplication {
	
	@RequestMapping("/{name}")
	@ResponseBody
	public String helloName (@PathVariable("name") String name) {
		return "Hello, " + name + "!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMtntwoApplication.class, args);
	}

}
