package com.cydeo.proxy;

import com.cydeo.model.Comment;

public interface CommentNotificationProxy {

    void sendComment(Comment comment); // this method need to get comment nd send it when needed
}
