package co.uk.hungerfree.backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) throws MalformedURLException, JsonProcessingException {
		SpringApplication.run(BackendApplication.class, args);

		new URL("https://www.givefood.org.uk/api/2/foodbanks/");


//		String jsString = JSONDeserializer.JsonToStringFromURL(new URL("https://www.givefood.org.uk/api/2/needs/"));
//		System.out.println(
//				JSONDeserializer.parseToFoodBankList(jsString)
//		);


	}

}
