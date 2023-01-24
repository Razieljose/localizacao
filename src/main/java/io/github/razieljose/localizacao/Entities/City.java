package io.github.razieljose.localizacao.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "City")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {

    @Id
    @Column(name = "Id")
    private Long Id;
    @Column(name = "Name", length = 50)
    private String name;
    @Column(name = "Population")
    private Long population;

}
