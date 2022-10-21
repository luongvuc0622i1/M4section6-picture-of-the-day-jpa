package com.codegym.service.comment;

import com.codegym.model.Comment;
import com.codegym.service.IGeneralService;

public interface ICommentService extends IGeneralService<Comment> {
    void addLike(Comment comment);
    void disLike(Comment comment);
}
