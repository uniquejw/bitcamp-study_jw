package com.eomcs.app1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerApp  {
	public static void main(String[] args)  throws Exception {
		System.out.println("[계산기 서버]");

		ServerSocket serversocket = new ServerSocket(8888);

		System.out.println("클라이언트의 연결을 기다림!");
		Socket socket = serversocket.accept();
		System.out.println("클라이언트와 연결됨!");

		Scanner in = new Scanner(socket.getInputStream());
		PrintStream out = new PrintStream(socket.getOutputStream());

		String request = in.nextLine();
		System.out.println("이름: " + request);

		out.println(request + "님 반갑습니다.");



		socket.close();
		System.out.println("클라이언트 연결 종료!");

		serversocket.close();
		System.out.println("서버 종료!");
	}
}
