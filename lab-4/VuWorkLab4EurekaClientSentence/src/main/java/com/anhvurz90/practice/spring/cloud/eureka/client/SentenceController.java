/*
 * @(#)SentenceController.java
 *
 * Copyright 2020 by esoft systems (tm). 
 * All rights reserved.
 */
package com.anhvurz90.practice.spring.cloud.eureka.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * TODO: vu.nga Feb 5, 2020: Type description here
 *
 * @author Vu Nguyen Anh
 * @since 1.0
 *
 */
@RestController
public class SentenceController {

  @Autowired
  private DiscoveryClient discoveryClient;
  
  @GetMapping("/sentence")
  public String getSentence() {
    return String.format("%s %s %s %s %s.",
                         getWord("lab-4-subject"),
                         getWord("lab-4-verb"),
                         getWord("lab-4-article"),
                         getWord("lab-4-adjective"),
                         getWord("lab-4-noun"));
  }
  
  private String getWord(String service) {
    List<ServiceInstance> services = discoveryClient.getInstances(service);
    if (!CollectionUtils.isEmpty(services)) {
      URI uri = services.get(0).getUri();
      if (uri != null) {
        return (new RestTemplate()).getForObject(uri, String.class);
      }
    }
    return null;
  }
}
