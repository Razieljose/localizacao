package io.github.razieljose.localizacao;

import io.github.razieljose.localizacao.Entities.City;
import io.github.razieljose.localizacao.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class LocalizationApplication implements CommandLineRunner {

	@Autowired
	CityRepository cityRepository;
	void listCity(){
		cityRepository.findAll().forEach(System.out::println);
	}

	@Override
	public void run(String... args) throws Exception {
		listCity();
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizationApplication.class, args);
	}
}
