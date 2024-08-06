package com.selimhocaoglu.culinaryguide.service;

import com.selimhocaoglu.culinaryguide.model.Comment;
import com.selimhocaoglu.culinaryguide.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<Comment> getCommentsByRecipeId(Long recipeId){
        return commentRepository.findByRecipeId(recipeId);
    }

    public Comment saveComment(Comment comment){
        return commentRepository.save(comment);
    }
}
