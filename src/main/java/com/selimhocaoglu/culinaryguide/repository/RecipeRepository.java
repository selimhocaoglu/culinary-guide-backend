package com.selimhocaoglu.culinaryguide.repository;

import com.selimhocaoglu.culinaryguide.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
