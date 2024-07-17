package chapter1.practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {

		// 모두 대문자로 만들기
		// 사용자로부터 문자열 statement를 입력받고
		// 입력 받은 문자열을 영어라면 모두 대문자로 변경하여
		// 문자배열에 저장한 후 출력
		
		Scanner scanner = new Scanner(System.in);
		
		String statement = null;
		char[] statementChars = null;
		
//		System.out.print("문자열 입력 : ");
//		statement = scanner.nextLine();
//		statement = statement.toUpperCase();
//		
//		statementChars = new char[statement.length()];
//		
//		for (int i = 0; i < Chars.length; i++) {
//			Chars[i] = statement.charAt(i);
//		}
		
		
//		System.out.print("문자열 입력 : ");
//		statement = scanner.nextLine();
//		statementChars = statement.toCharArray();
//		
//		for (int i = 0; i < statementChars.length; i++) {
//			char charater = statementChars[i];
//			
//			boolean lowerEnglish = charater > 96 && charater < 123;
//			
//			if (!lowerEnglish) {
//				continue;
//			}else if (lowerEnglish) {
//				statementChars[i] = (char) (charater - 32);
//			}
//		}
//		
//		System.out.print("대문자 변환 : ");
//		System.out.println(statementChars);
		
		scanner.close();
		
		
	}

}
