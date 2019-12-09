package com.barcode.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barcode.web.dto.PostsSaveRequestDto;
import com.barcode.web.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello(){
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){

        System.out.println("Post posts !");
        System.out.println("Post title : " + dto.getTitle());
        System.out.println("Post content : " + dto.getContent());
        System.out.println("Post author : " + dto.getAuthor());

        return postsService.save(dto);
    }

}
