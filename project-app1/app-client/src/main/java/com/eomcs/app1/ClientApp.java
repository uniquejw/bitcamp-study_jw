package com.eomcs.app1;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientApp  {
	public static void main(String[] args) throws Exception {
		System.out.println("[계산기 클라이언트]");

		Socket socket = new Socket("127.0.0.1", 8888);
		System.out.println("서버와 연결되었음!");

		PrintStream out = new PrintStream(socket.getOutputStream());
		Scanner in = new Scanner(socket.getInputStream());

		out.println("강사");

		String response = in.nextLine();
		System.out.println("==> " + response);

		out.close();
		in.close();

		socket.close();
		System.out.println("서버와 연결을 종료!");
	}
}
