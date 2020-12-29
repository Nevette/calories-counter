package com.calories.counter.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "ingredients")
public class IngredientDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ingredients_sequence")
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "kcal")
    private Double kcal;
    @Column(name = "unit")
    private String unit;

}
