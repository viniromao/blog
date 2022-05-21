package com.blog.victor.dto;

import com.blog.victor.domain.Post;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Data
@Slf4j
public class PostRequest {

    private String autor;

    private String cabecalho;

    private LocalDateTime data;

    private String corpo;

    private String fonte;

    private String rodape;

    public Post toDomain() {
        return Post.builder()
                .autor(this.autor)
                .cabecalho(this.cabecalho)
                .data(this.data)
                .corpo(this.corpo)
                .fonte(this.fonte)
                .rodape(this.rodape)
                .build();
    }
}
