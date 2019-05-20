package webportal.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@SpringBootApplication
@ComponentScan("webportal.controllers, webportal.config")
public class Main {
	
/* 	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    } */
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
