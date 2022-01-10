package Root;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfiguracionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionesApplication.class, args);
	}

}
