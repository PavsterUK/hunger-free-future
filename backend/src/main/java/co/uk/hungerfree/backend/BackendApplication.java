package co.uk.hungerfree.backend;

import co.uk.hungerfree.backend.model.FoodBank;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;


@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) throws MalformedURLException, JsonProcessingException {
		SpringApplication.run(BackendApplication.class, args);


	}

}


