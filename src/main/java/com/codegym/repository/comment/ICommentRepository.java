package com.codegym.repository.comment;

import com.codegym.model.Comment;
import com.codegym.repository.IGeneralRepository;

public interface ICommentRepository extends IGeneralRepository<Comment> {
    void addLike(Comment comment);
    void disLike(Comment comment);
}
