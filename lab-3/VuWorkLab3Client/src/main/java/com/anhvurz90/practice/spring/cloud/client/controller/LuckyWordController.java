/*
 * @(#)LuckyWordController.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.spring.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: vu.nga Jan 29, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@RestController
public class LuckyWordController {

  @Value("${lucky-word}")
  private String luckyWord;
  
  @GetMapping("/lucky-word")
  public String showLuckyWord() {
    return "The lucky word is: " + luckyWord;
  }
}
