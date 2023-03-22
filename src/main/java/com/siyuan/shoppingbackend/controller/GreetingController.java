package com.siyuan.shoppingbackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GreetingController {
  @RequestMapping("/greeting")
  public String greeting() {
   
    return "Hello!";
  }

}