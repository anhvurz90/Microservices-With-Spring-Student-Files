/*
 * @(#)WordController.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.spring.cloud.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: vu.nga Feb 04, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@RestController
public class WordController {
  
  @Value("${words}")
  private String words;
  
  @GetMapping("/")
  public String getWord() {
    String[] wordArr = words.split(",");
    return wordArr[(int)Math.round(Math.random() * (wordArr.length - 1))];
  }
}
