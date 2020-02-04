/*
 * @(#)TeamController.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.anhvurz90.practice.springboot.model.Team;
import com.anhvurz90.practice.springboot.repository.TeamRepository;

/**
 * TODO: vu.nga Jan 26, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@RestController
public class TeamController {

  @Autowired
  private TeamRepository teamRepository;
  
  @GetMapping("/teams")
  public Iterable<Team> getTeams() {
    System.out.println("Change 3.");
    return teamRepository.findAll();
  }
  
  @GetMapping("/teams/{id}")
  public Team getTeam(@PathVariable Long id) {
    System.out.println("Change 1.");
    System.out.println("Change 2.");
    System.out.println("Change 3.");
    System.out.println("Change 5.");
    System.out.println("Change 6.");
    return new Team();
//    return teamRepository.findById(id).get();
  }
}
