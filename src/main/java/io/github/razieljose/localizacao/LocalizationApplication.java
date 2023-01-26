package io.github.razieljose.localizacao;

import io.github.razieljose.localizacao.Repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizationApplication implements CommandLineRunner {

    @Autowired
    CityRepository cityRepository;

    void listCity() {
        cityRepository.findAll().forEach(System.out::println);
    }

    void listCityPerName() {
        cityRepository.findByName("PERNAMBUCO").forEach(System.out::println);
    }

    void listCityPerPopulation() {
        cityRepository.findByPopulation(14124132512L).forEach(System.out::println);
    }

    void listCityPerNameStartingWith() {
        cityRepository.findByNameStartingWith("SAO").forEach(System.out::println);
    }

    void listCityPerNameContaining() {
        cityRepository.findByNameContaining("PORTO").forEach(System.out::println);
    }
	void listCityPerNameLike() {
        cityRepository.findByNameLike("%ONAS").forEach(System.out::println);
    }

    void listCityPerPopulationLessThan(){
        cityRepository.findByPopulationLessThan(1000L).forEach(System.out::println);
    }

    void listPerCityPerPopulationGreaterThan(){
        cityRepository.findByPopulationGreaterThanEqual(123L).forEach(System.out::println);
    }

    void listPerCityPerPopulationGreaterThanAndNameLike(){
        cityRepository.findByPopulationGreaterThanEqualAndNameLike(123L, "PER%").forEach(System.out::println);
    }

    @Override
    public void run(String... args) throws Exception {
        listCity();
        listCityPerName();
        listCityPerPopulation();
        listCityPerNameStartingWith();
        listCityPerNameContaining();
		listCityPerNameLike();
        listCityPerPopulationLessThan();
        listPerCityPerPopulationGreaterThan();
        listPerCityPerPopulationGreaterThanAndNameLike();
    }

    public static void main(String[] args) {
        SpringApplication.run(LocalizationApplication.class, args);
    }
}
