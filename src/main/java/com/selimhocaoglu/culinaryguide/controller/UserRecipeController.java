package com.selimhocaoglu.culinaryguide.controller;

import com.selimhocaoglu.culinaryguide.model.User;
import com.selimhocaoglu.culinaryguide.model.UserRecipe;
import com.selimhocaoglu.culinaryguide.service.UserRecipeService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public UserRecipe saveUserRecipe(@RequestBody UserRecipe userRecipe){
        return userRecipeService.saveUserRecipe(userRecipe);
    }
}
