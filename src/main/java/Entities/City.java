package Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "City")
@Data
public class City {

    @Id
    @Column(name = "id")
    private Long Id;
    @Column(name = "name", length = 50)
    private String name;
    @Column(name = "population")
    private Long population;

}
