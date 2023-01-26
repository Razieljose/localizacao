package io.github.razieljose.localizacao;

import io.github.razieljose.localizacao.Services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LocalizationApplication implements CommandLineRunner {

    @Autowired
    private CityService cityService;

    @Override
    public void run(String... args) throws Exception {
        cityService.listCity();
        cityService.listCityPerName();
        cityService.listCityPerPopulation();
        cityService.listCityPerNameStartingWith();
        cityService.listCityPerNameContaining();
        cityService.listCityPerNameLike();
        cityService.listCityPerPopulationLessThan();
        cityService.listPerCityPerPopulationGreaterThan();
        cityService.listPerCityPerPopulationGreaterThanAndNameLike();
    }

    public static void main(String[] args) {
        SpringApplication.run(LocalizationApplication.class, args);
    }
}
