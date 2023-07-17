package com.myblogapp2.blogapp2.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="posts",uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}


)
public class Post {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
@Column(name="description",nullable = false)
    private String title;
@Column(name="description",nullable = false)
    private String descripton;
@Column(name="content",nullable = false)
    private String content;



}
