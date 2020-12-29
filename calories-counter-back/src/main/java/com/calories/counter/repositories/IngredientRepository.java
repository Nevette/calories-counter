package com.calories.counter.repositories;

import com.calories.counter.dtos.IngredientDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientRepository extends CrudRepository<IngredientDTO, Integer> {

}
