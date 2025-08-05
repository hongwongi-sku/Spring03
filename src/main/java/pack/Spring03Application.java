package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Spring03Application {
	
	@GetMapping("/")
	public String tiger() {
		return "Spring03:1540";
	}

	
	public static void main(String[] args) {
		SpringApplication.run(Spring03Application.class, args);
	}

}
