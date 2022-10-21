package com.codegym.service.comment;

import com.codegym.model.Comment;
import com.codegym.repository.comment.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CommentService implements ICommentService {
    @Autowired
    private ICommentRepository commentRepository;

    @Override
    public List<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Comment findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }

    @Override
    public void remove(Long id) {
        commentRepository.remove(id);
    }

    @Override
    public void addLike(Comment comment) {
        commentRepository.addLike(comment);
    }

    @Override
    public void disLike(Comment comment) {
        commentRepository.disLike(comment);
    }
}
