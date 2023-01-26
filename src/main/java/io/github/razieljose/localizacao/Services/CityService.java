package io.github.razieljose.localizacao.Services;

import io.github.razieljose.localizacao.Entities.City;
import io.github.razieljose.localizacao.Repositories.CityRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CityService {
        private CityRepository repository;

        public CityService(CityRepository repository) {
            this.repository = repository;
        }

        void saveCity() {
            var city = new City(1L, "SANTA CATARINA", 31231231L);
            repository.save(city);
        }

        public void listCity() {
            repository.findAll().forEach(System.out::println);
        }

    public void listCityPerName() {
            repository.findByName("PERNAMBUCO").forEach(System.out::println);
        }

    public void listCityPerPopulation() {
            repository.findByPopulation(14124132512L).forEach(System.out::println);
        }

    public void listCityPerNameStartingWith() {
            repository.findByNameStartingWith("SAO").forEach(System.out::println);
        }

    public void listCityPerNameContaining() {
            repository.findByNameContaining("PORTO").forEach(System.out::println);
        }

    public void listCityPerNameLike() {
            repository.findByNameLike("%ONAS").forEach(System.out::println);
        }

    public void listCityPerPopulationLessThan() {
            repository.findByPopulationLessThan(1000L).forEach(System.out::println);
        }

    public void listPerCityPerPopulationGreaterThan() {
            repository.findByPopulationGreaterThanEqual(123L).forEach(System.out::println);
        }

    public void listPerCityPerPopulationGreaterThanAndNameLike() {
            repository.findByPopulationGreaterThanEqualAndNameLike(123L, "PER%").forEach(System.out::println);
        }
    }





