package pl.pjatk.paw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:applicationContext.xml"})
@EnableConfigurationProperties
public class PawApplication {

	public static void main(String[] args) {
		SpringApplication.run(PawApplication.class, args);
	}

}
