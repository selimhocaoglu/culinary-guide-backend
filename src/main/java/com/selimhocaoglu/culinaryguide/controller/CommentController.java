package com.selimhocaoglu.culinaryguide.controller;


import com.selimhocaoglu.culinaryguide.model.Comment;
import com.selimhocaoglu.culinaryguide.service.CommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/recipe/{recipeId}")
    public List<Comment> getCommentsByRecipeId(@PathVariable Long recipeId){
        return commentService.getCommentsByRecipeId(recipeId);
    }

    @PostMapping
    public Comment saveComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }
}
