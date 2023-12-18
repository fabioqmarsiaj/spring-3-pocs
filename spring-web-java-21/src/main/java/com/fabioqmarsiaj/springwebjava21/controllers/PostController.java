package com.fabioqmarsiaj.springwebjava21.controllers;

import com.fabioqmarsiaj.springwebjava21.domain.Post;
import com.fabioqmarsiaj.springwebjava21.integrations.JsonPlaceholderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/post")
public class PostController {

    private final JsonPlaceholderService jsonPlaceholderService;

    public PostController(JsonPlaceholderService jsonPlaceholderService) {
        this.jsonPlaceholderService = jsonPlaceholderService;
    }

    @GetMapping("")
    List<Post> findALl() {
        return jsonPlaceholderService.findAll();
    }
}
