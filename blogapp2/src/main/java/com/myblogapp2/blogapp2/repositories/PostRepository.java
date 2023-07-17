package com.myblogapp2.blogapp2.repositories;

import com.myblogapp2.blogapp2.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
