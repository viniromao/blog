package com.blog.victor.domain;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.time.LocalDateTime;


@Entity
@Slf4j
public class BlogPost {
   @Column
   private String autor;

   @Column
   private String cabecalho;

   @Column
   private LocalDateTime data;

   @Column
   private String corpo;

   @Column
   private String fonte;

   @Column
   private String rodapé;

}
