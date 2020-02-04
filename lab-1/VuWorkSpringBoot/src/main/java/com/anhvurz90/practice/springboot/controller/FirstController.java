/*
 * @(#)FirstController.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * TODO: vu.nga Jan 25, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@Controller
public class FirstController {

  @GetMapping("/")
  public String hello() {
    return "hello";
  }
}
