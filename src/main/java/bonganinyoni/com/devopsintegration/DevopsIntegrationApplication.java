package bonganinyoni.com.devopsintegration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DevopsIntegrationApplication {
	@GetMapping
	public  String message() {return "Welcome to Bongani World";}

	public static void main(String[] args) {
		SpringApplication.run(DevopsIntegrationApplication.class, args);
	}

}
