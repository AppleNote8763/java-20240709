package chapter1.practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {

		// 문자열 자르기
		// 사용자로부터 문자열을 입력받고
		// 사용자로부터 시작인덱스와 종료인덱스를 입력받고
		// 입력받은 시작 인덱스와 종료 인덱스까지 문자열을 잘라서
		// 자른 문자열을 출력
		
		// string 기능 substring을 사용하지 않고 char[]을 이용해서 작성
		
		Scanner scanner = new Scanner(System.in);
		
		String statment = null;
		int firstIndex = 0;
		int secondIndex = 0;
		char[] Chars = null;
		char[] statmentChars = null;
		
		System.out.print("받을 문자열 : ");
		
//		statment = "내가 그린 기린 그림은 잘 그린 기린 그림이고 네가 그린 기린 그림은 잘 못그린 기린 그림이다.";	// 마지막 인덱스 값 53
//		statment = scanner.nextLine();
		
		statment = scanner.nextLine();
		
		System.out.print("시작 인덱스 : ");
		firstIndex = scanner.nextInt();
		
		System.out.print("종료 인덱스 : ");
		secondIndex = scanner.nextInt();
		
		statmentChars = statment.toCharArray();		// 42번 주석을 지우고 43번 주석처리 하면 해당줄 주석처리 가능
		Chars = new char[secondIndex - firstIndex];
		
		for (int i = 0; i < secondIndex - firstIndex; i++) {
//			Chars[i] = statment.charAt(i + firstIndex);
			Chars[i] = statmentChars[i + firstIndex];
		}
		System.out.println(Chars);
		
		System.out.println(statment.length());
		
		scanner.close();
		
		
	}

}
