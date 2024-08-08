package com.selimhocaoglu.culinaryguide.repository;

import com.selimhocaoglu.culinaryguide.model.Recipe;
import com.selimhocaoglu.culinaryguide.model.UserRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByCategory(String category);
}
