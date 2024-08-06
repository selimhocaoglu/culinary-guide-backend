package com.selimhocaoglu.culinaryguide.repository;

import com.selimhocaoglu.culinaryguide.model.UserRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRecipeRepository extends JpaRepository<UserRecipe, Long> {
    List<UserRecipe> findByUserId(Long userId);
}
