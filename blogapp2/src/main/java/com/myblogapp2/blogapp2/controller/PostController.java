package com.myblogapp2.blogapp2.controller;

import com.myblogapp2.blogapp2.payload.PostDto;
import com.myblogapp2.blogapp2.services.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    private PostService postService;

    public PostController(PostService postService){
        this.postService=postService;
    }

    @PostMapping
    public ResponseEntity<PostDto> createPost(PostDto postDto){
      return new ResponseEntity<>(postService.createPost(PostDto postDto)) ;
    }
}
