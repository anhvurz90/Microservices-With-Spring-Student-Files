/*
 * @(#)TeamRepository.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.anhvurz90.practice.springboot.model.Team;

/**
 * TODO: vu.nga Jan 26, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team, Long>{

}
