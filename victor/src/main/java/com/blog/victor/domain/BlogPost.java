package com.blog.victor.domain;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import java.time.LocalDateTime;


@Entity
@Slf4j
public class BlogPost {
   private String autor;

   private String cabecalho;

   private LocalDateTime data;

   private String corpo;

   private String fonte;

   private String rodapé;

}
