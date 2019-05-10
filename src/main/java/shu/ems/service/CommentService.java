package shu.ems.service;

import shu.ems.model.Comment;

public class CommentService {
    public boolean insertComment(Comment comment){
        return new CommentDAO().insertComment(comment);
    }

    public boolean updateComment(Comment comment){
        return new CommentDAO().updateComment(comment);
    }

    public boolean deleteComment(int id){
        return new CommentDAO().deleteComment(id);
    }

    public Comment findCommentById(int id){
        // find in database
        return null;
    }

    public Comment findCommentByCourseId(String name){
        // find in database
        return null;
    }
}
