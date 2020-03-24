package io.dowlath.springbootmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("io.dowlath.springbootmongo.repository")
@ComponentScan("io.dowlath.springbootmongo.*")
public class SpringbootMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoApplication.class, args);
	}

}
