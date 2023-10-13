package com.SpringApi.SpringApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApiApplication.class, args);

		String url = "https://catfact.ninja/fact?max_length=140";

		WebClient.Builder builder = WebClient.builder();

		CatFact catFact = builder.build()
				.get()
				.uri(url)
				.retrieve()
				.bodyToMono(CatFact.class)
				.block();


		System.out.println("*****************************<CAT FACT>*************************************");
		System.out.println(catFact);
		System.out.println("*****************************</CAT FACT>*************************************");
	}

}
