package com.example.springcloudopenfeignclientreference.controller;

import com.example.springcloudopenfeignclientreference.model.Post;
import com.example.springcloudopenfeignclientreference.service.PostService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/posts")
public class PostController {

    private final PostService postService;


    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<List<Post>> getPosts() {
        log.info("Getting posts");

        List<Post> posts = postService.getPosts();

        return ResponseEntity.ok(posts);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable("id") Long postId) {
        log.info("Get post by id: {}", postId);

        Post post = postService.getPostById(postId);

        return ResponseEntity.ok(post);
    }
}
