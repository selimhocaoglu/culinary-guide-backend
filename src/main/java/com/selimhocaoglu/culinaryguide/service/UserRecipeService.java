package com.selimhocaoglu.culinaryguide.service;

import com.selimhocaoglu.culinaryguide.model.UserRecipe;
import com.selimhocaoglu.culinaryguide.repository.UserRecipeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRecipeService {
    private final UserRecipeRepository userRecipeRepository;

    public UserRecipeService(UserRecipeRepository userRecipeRepository) {
        this.userRecipeRepository = userRecipeRepository;
    }

    public List<UserRecipe> getUserRecipes(Long userId){
        return userRecipeRepository.findByUserId(userId);
    }

    public UserRecipe saveUserRecipe(UserRecipe userRecipe){
        return userRecipeRepository.save(userRecipe);
    }
}
