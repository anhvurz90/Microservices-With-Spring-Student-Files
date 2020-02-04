package com.anhvurz90.practice.springboot;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.anhvurz90.practice.springboot.model.Player;
import com.anhvurz90.practice.springboot.model.Team;
import com.anhvurz90.practice.springboot.repository.TeamRepository;

@SpringBootApplication
public class VuWorkSpringBootApplication {

  @Autowired
  private TeamRepository teamRepository;
  
	public static void main(String[] args) {
		SpringApplication.run(VuWorkSpringBootApplication.class, args);
	}

	@PostConstruct
	public void init() {
	  List<Team> list = new ArrayList<>();

	  Set<Player> players = new HashSet<>();
	  players.add(Player.builder().name("Big Easy").position("Showman").build());
	  players.add(Player.builder().name("Buckets").position("Guard").build());
	  players.add(Player.builder().name("Dizzy").position("Guard").build());
	  
    Team team = new Team();
    team.setLocation("Harlem");
    team.setName("Globetrotters");
    team.setPlayers(players);
    list.add(team);

    team = new Team();
    team.setLocation("Washington");
    team.setName("Generals");
    list.add(team);

    teamRepository.saveAll(list);
	}
}
