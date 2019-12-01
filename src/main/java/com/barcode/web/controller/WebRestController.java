package com.barcode.web.controller;

import com.barcode.web.domain.posts.PostsRepository;
import com.barcode.web.dto.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){

        System.out.println("Post posts !");
        System.out.println("Post title : " + dto.getTitle());
        System.out.println("Post content : " + dto.getContent());
        System.out.println("Post author : " + dto.getAuthor());
        postsRepository.save(dto.toEntity()

        );
    }

}
