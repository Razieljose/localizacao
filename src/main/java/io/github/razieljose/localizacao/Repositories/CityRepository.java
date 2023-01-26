package io.github.razieljose.localizacao.Repositories;

import io.github.razieljose.localizacao.Entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository <City, Long>{

List<City> findByName(String name);
List<City> findByNameStartingWith(String name);
List<City> findByNameContaining(String name);
List<City> findByPopulation(Long population);
    List<City> findByNameLike(String name);
}
