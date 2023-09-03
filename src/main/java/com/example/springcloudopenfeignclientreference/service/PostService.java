package com.example.springcloudopenfeignclientreference.service;

import com.example.springcloudopenfeignclientreference.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getPosts();
}
