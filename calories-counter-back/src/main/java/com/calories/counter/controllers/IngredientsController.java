package com.calories.counter.controllers;

import com.calories.counter.dtos.CustomerComplaint;
import com.calories.counter.dtos.IngredientDTO;
import com.calories.counter.repositories.IngredientRepository;
import com.calories.counter.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class IngredientsController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping("/ingredient/{id}")
    public IngredientDTO getIngredient(@RequestParam(value="id") Integer id){
        Optional<IngredientDTO> receivedIngredient = ingredientService.getIngredientById(id);
        if (receivedIngredient.isPresent()){
            return receivedIngredient.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingredient not found.");
        }
    }

    @GetMapping("/ingredients")
    public List<IngredientDTO> getAllIngredients() {
        return ingredientService.getAllIngredients();
    }

    @PutMapping("/addIngredient")
    public IngredientDTO addIngredient(@RequestParam(value = "name") String name,
                                       @RequestParam(value = "weight") Double weight,
                                       @RequestParam(value = "kcal") Double kcal,
                                       @RequestParam(value = "unit") String unit) {
        IngredientDTO newIngredient = new IngredientDTO();
        newIngredient.setName(name);
        newIngredient.setWeight(weight);
        newIngredient.setKcal(kcal);
        newIngredient.setUnit(unit);
        ingredientService.putIngredient(newIngredient);
        return null;
    }
}
