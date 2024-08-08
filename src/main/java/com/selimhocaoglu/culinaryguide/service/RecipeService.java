package com.selimhocaoglu.culinaryguide.service;

import com.selimhocaoglu.culinaryguide.model.Recipe;
import com.selimhocaoglu.culinaryguide.repository.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }

    public Recipe getRecipeById(Long id){
        return recipeRepository.findById(id).orElse(null);
    }

    public List<Recipe> getRecipesByCategory(String category){
        return recipeRepository.findByCategory(category);
    }

    public Recipe saveRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }
}
