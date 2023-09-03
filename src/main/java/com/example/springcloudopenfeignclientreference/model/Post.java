package com.example.springcloudopenfeignclientreference.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Post {
    private Long userId;
    private Long id;
    private String title;
    private String body;
}
