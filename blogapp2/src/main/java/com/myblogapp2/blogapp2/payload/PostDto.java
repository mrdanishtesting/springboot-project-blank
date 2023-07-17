package com.myblogapp2.blogapp2.payload;

import lombok.Data;

@Data
public class PostDto {

    private long id;
    private String description;
    private String content;
    private String title;


}
