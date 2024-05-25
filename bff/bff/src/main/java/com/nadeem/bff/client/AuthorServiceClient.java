package com.nadeem.bff.client;

import com.nadeem.bff.model.Author;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "author-service", url="${author-service.url}")
public interface AuthorServiceClient {
    @GetMapping("/author/{id}")
    Author getAuthorById(@PathVariable("id") Long id);
}
