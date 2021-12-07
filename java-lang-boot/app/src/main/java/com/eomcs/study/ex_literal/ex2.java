package com.eomcs.study.ex_literal;


//과제 1 : 가위,바위,보 게임 애플리케이션을 작성하라.
//- 실행1
//가위,바위,보? 보
//컴퓨터: 가위  (랜덤 값이 출력된다. 힌트: Math.random())
//=> 졌습니다.
//
//- 실행2
//가위,바위,보? 바위
//컴퓨터: 가위
//=> 이겼습니다.
//

import java.util.Scanner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/game/rock")
public class ex2 {
  @GetMapping("/paper")
  public static void main(String[] args) {
    // 컴퓨터의 가위, 바위, 보 계산하기
    Scanner keyScan = new Scanner(System.in);

    System.out.print("가위,바위,보? ");
    String user = keyScan.nextLine();
    System.out.printf("사용자: %s\n", user);

    int random = (int)(Math.random() * 3);
    String computer;
    if (random == 0) 
      computer = "가위";
    else if (random == 1) 
      computer = "바위";
    else 
      computer = "보";

    System.out.printf("컴퓨터: %s\n", computer);

    if (user.equals("가위")) {
      if (computer.equals("보")) {
        System.out.println("=> 당신이 이겼습니다.");
        return;
      }
    } else if (user.equals("바위")) {
      if (computer.equals("가위")) {
        System.out.println("=> 당신이 이겼습니다.");
        return;
      }
    } else {
      if (computer.equals("바위")) {
        System.out.println("=> 당신이 이겼습니다.");
        return;
      }
    }

    System.out.println("=> 당신은 비기거나 졌습니다.");

    keyScan.close();
  }
}










