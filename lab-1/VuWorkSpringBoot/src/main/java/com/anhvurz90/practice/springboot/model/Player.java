/*
 * @(#)Player.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO: vu.nga Jan 27, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {

  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String position;
}
