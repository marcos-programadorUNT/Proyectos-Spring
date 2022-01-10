package Root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FinancieraApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancieraApplication.class, args);
	}

}
