package com.course.thymeleaf.service;

import com.course.thymeleaf.domain.Post;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    public ArrayList<Post> getPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        Post post1 = new Post("header 1", getPostBody(), "vladic");
        Post post2 = new Post("header 2", getPostBody(), "maska");
        Post post3 = new Post("header 3", getPostBody(), "serega");
        Post post4 = new Post("header 4", getPostBody(), "vitalia");
        Post post5 = new Post("header 5", getPostBody(), "igor");
        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);
        posts.add(post5);
        return posts;
    }

    private String getPostBody(){
        String body = "Lorem ipsum dolor sit amet, "
            + "consectetur adipiscing elit. "
            + "In ac finibus mi. Morbi porttitor urna dui,"
            + " sed volutpat justo rutrum sit amet. Etiam elementum lacus eget malesuada egestas."
            + " Sed id lectus arcu. Pellentesque molestie dignissim diam non commodo. Nunc nec aliquet lectus. "
            + "Ut a accumsan sapien. Pellentesque sit amet sem nisl. Nulla fringilla vulputate mauris, eleifend dapibus libero. "
            + "Sed eu cursus orci. In hac habitasse platea dictumst. Vestibulum vel vulputate ex. Nam gravida blandit nisl,"
            + " at luctus mi interdum ut."
            + " Pellentesque et pharetra mi. Proin id placerat diam. Ut porttitor risus in leo tincidunt, a iaculis velit maximus.";
        body += "Nunc bibendum sollicitudin ex, vitae lobortis nunc malesuada eget. Maecenas aliquam aliquam elit, "
            + "nec rutrum justo blandit sit amet. Cras pellentesque egestas nisi at egestas. Donec lacus ipsum, "
            + "dignissim a accumsan quis, rutrum ac massa. Vivamus sed dolor nisl. Integer convallis, elit sed euismod molestie, "
            + "purus velit ornare justo, ac maximus diam odio id felis. Maecenas auctor sed quam ac aliquet. Curabitur tempus "
            + "sed purus sit amet blandit.";
        body += "Curabitur eget arcu elementum, pulvinar odio ut, dictum tellus. In hac habitasse platea dictumst. "
            + "Proin sagittis a ex id tempor. Proin faucibus risus non pellentesque vulputate. Morbi augue sem, finibus non leo ut,"
            + " fermentum auctor massa. Mauris nisi felis, posuere ut efficitur eu, gravida nec enim."
            + " Curabitur tempus id nulla in iaculis. Mauris varius accumsan nunc ut pellentesque."
            + " Sed placerat vel nisl quis ornare. Ut imperdiet felis et massa facilisis, "
            + "vel vestibulum erat varius. Etiam tristique dignissim leo, congue tincidunt mi finibus vitae. "
            + "Suspendisse quis risus eget arcu pharetra tincidunt eu non sapien. Cras sollicitudin,"
            + " lectus non venenatis ullamcorper, eros quam condimentum libero, nec fermentum purus neque eu eros."
            + " Nullam eget blandit nunc. Mauris ultricies sed sapien non aliquam. Etiam bibendum lectus scelerisque neque eleifend, "
            + "non semper nisi condimentum.";
        return body;
    }

}
