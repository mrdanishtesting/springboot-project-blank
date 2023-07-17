package com.myblogapp2.blogapp2.services;

import com.myblogapp2.blogapp2.entities.Post;
import com.myblogapp2.blogapp2.payload.PostDto;
import com.myblogapp2.blogapp2.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    private PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo){
        this.postRepo=postRepo;
    }


    @Override
    public PostDto createPost(PostDto postDto) {

       Post post=new Post();
       post.setId(postDto.getId());
       post.setTitle(postDto.getTitle());
       post.setContent(postDto.getContent());
       post.setDescripton(postDto.getDescription());
        Post postEntity = postRepo.save(post);


        PostDto dto=new PostDto();
        dto.setId(postEntity.getId());
        dto.setContent(postEntity.getContent());
        dto.setTitle(postEntity.getTitle());
        dto.setDescription(postEntity.getDescripton());
        return dto;
    }
}
