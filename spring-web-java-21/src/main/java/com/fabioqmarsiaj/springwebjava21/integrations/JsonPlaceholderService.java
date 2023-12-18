package com.fabioqmarsiaj.springwebjava21.integrations;

import com.fabioqmarsiaj.springwebjava21.domain.Post;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface JsonPlaceholderService {

    @GetExchange("/posts")
    List<Post> findAll();
}
