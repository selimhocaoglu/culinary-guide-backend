package com.selimhocaoglu.culinaryguide.controller;

import com.selimhocaoglu.culinaryguide.model.User;
import com.selimhocaoglu.culinaryguide.model.UserRecipe;
import com.selimhocaoglu.culinaryguide.service.UserRecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user-recipes")
public class UserRecipeController {
    private final UserRecipeService userRecipeService;

    public UserRecipeController(UserRecipeService userRecipeService) {
        this.userRecipeService = userRecipeService;
    }

    @GetMapping("/{userId}")
    public List<UserRecipe> getUserRecipes(@PathVariable Long userId){
        return userRecipeService.getUserRecipes(userId);
    }

    @GetMapping("/{userId}/date")
    public List<UserRecipe> getUserRecipes(@PathVariable Long userId, @RequestParam Date date){
        return userRecipeService.getUserRecipesByDate(userId, date);
    }

    @GetMapping("/{userId}/date/meal")
    public List<UserRecipe> getUserRecipes(@PathVariable Long userId, @RequestParam Date date, @RequestParam String mealType){
        return userRecipeService.getUserRecipesByDateAndMealType(userId, date, mealType);
    }

    @PostMapping
    public UserRecipe saveUserRecipe(@RequestBody UserRecipe userRecipe){
        return userRecipeService.saveUserRecipe(userRecipe);
    }
}
