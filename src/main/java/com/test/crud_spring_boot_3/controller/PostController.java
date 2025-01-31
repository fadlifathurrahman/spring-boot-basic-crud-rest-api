package com.test.crud_spring_boot_3.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.crud_spring_boot_3.model.Post;
import com.test.crud_spring_boot_3.service.PostService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("api/post")
public class PostController {

    private PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> findAllPost() {
        
        List<Post> postList = postService.findAll();
        return new ResponseEntity<>(postList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Post> saveNewPost(@RequestBody Post post){

        Post postResult = postService.createPost(post);
        return new ResponseEntity<>(postResult, HttpStatus.OK);    }

    @PutMapping("{id}")
    public ResponseEntity<Post> updatePost(@PathVariable("id") Long postId, @RequestBody Post post) {

        post.setId(postId);
        Post updatedPost = postService.updatePost(post);
        return new ResponseEntity<>(updatedPost, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Object> deletePostById(@PathVariable("id") Long postId){

        postService.deletePostById(postId);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Post has been successfully deleted");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    
}
