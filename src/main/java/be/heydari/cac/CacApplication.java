package be.heydari.cac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author Emad Heydari Beni
 */
@SpringBootApplication
@EnableMongoRepositories
public class CacApplication {

	public static void main(String[] args) {
		SpringApplication.run(CacApplication.class, args);
	}

}
