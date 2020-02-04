/*
 * @(#)Team.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.springboot.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

/**
 * TODO: vu.nga Jan 26, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@Data
@Entity
public class Team {
  
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String location;
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name="teamId")
  private Set<Player> players;
  
}
