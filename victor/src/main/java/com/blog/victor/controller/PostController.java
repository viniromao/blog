package com.blog.victor.controller;

import com.blog.victor.dto.PostRequest;
import com.blog.victor.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping
    public ResponseEntity<Void> post(@RequestBody PostRequest postRequest) {

        /*
        TODO: Implementar metodo de validação de postRequest abaixo.
        requisitos:
         - Nenhum campo seja nulo
         - Quero que a data seja anterior a data atual
         - método deve retornar um boolean verdadeiro se ele estiver válido

         dar uma pesquisada no que é Domain Driven Design (DDD)

         */
        postService.validatePostRequest();

        postService.save(postRequest.toDomain());

        return ResponseEntity.ok().build();
    }
}
