package com.eomcs.study.ex_literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/literal/exam1")
public class ex1 {
  @GetMapping("/Hello")
  public void test9() {
    System.out.println("안녕하세요!");
  }
}
