package com.course.thymeleaf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private String header;
    private String body;
    private String author;

    @Override public String toString() {
        return "Post{" + "header='" + header + '\'' + ", body='" + body + '\'' + ", author='" + author + '\'' + '}';
    }
}
