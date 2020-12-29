package com.calories.counter.services;

import com.calories.counter.dtos.IngredientDTO;
import com.calories.counter.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepository ingredientRepository;

    public List<IngredientDTO> getAllIngredients(){
        return (List<IngredientDTO>) ingredientRepository.findAll();
    }

    public Optional<IngredientDTO> getIngredientById(Integer id){
        return ingredientRepository.findById(id);
    }

    public void putIngredient(IngredientDTO newIngredient){
        ingredientRepository.save(newIngredient);
    }
}
