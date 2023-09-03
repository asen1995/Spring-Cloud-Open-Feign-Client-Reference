package com.example.springcloudopenfeignclientreference.service;

import com.example.springcloudopenfeignclientreference.feign.JSONPlaceHolderServiceFeignClient;
import com.example.springcloudopenfeignclientreference.model.Post;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PostServiceImpl implements PostService {

    private final JSONPlaceHolderServiceFeignClient jsonPlaceHolderServiceClient;

    public PostServiceImpl(JSONPlaceHolderServiceFeignClient jsonPlaceHolderServiceClient) {
        this.jsonPlaceHolderServiceClient = jsonPlaceHolderServiceClient;
    }

    @Override
    public List<Post> getPosts() {
        log.info("Getting posts");
        final List<Post> postsFrom = jsonPlaceHolderServiceClient.getPosts();
        log.debug("Posts: {}", postsFrom);
        return postsFrom;
    }
}
