package chapter1;

public class ControllFor {

	public static void main(String[] args) {

		// 반복문 : 특정 조건에 만족하면 지정한 코드 블럭을 반복 실행하도록 하는 것
		
		// for 문 : 일반적으로 반복 횟수가 정해져 있을때 사용하는 반복문
		// for (조건에사용할변수초기화; 조건; 조건에사용할변수변경) {반복할 코드블럭}
		
//		System.out.println("안녕하세요.");
		for (int i = 0; i < 10; i++) {
			int number = i + 1;
			System.out.println("안녕하세요." + number);
		}
		System.out.println();
		
		for (int i = 0; i < 9; i++) {
			int number = i + 1;
			String result = "4 * " + number + " = " + (4 * number);
			System.out.println(result);
		}
		System.out.println();
		
		String[] fruits = new String[] {"apple", "banana", "cacao"};
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println();
		
		for (int i = 0; i < fruits.length; i++) {
			fruits[i] += " add";
		}
		
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println();
		
		// foreach : 컬렉션(배열)의 각 요소를 하나씩 변수에 복사하여 사용하는 반복문
		// 실제 요소에 대해서 읽기전용, 복사한 요소를 변경하더라도 실제 요소에는 영향이 없음
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println();
		
//		for (int i = 0; i < fruits.length; i++) {
//			String fruit = fruits[i] + " add";
//		}
		
		// 48~50 번째와 같은 기능을 수행
		for (String fruit : fruits) {
			fruit += " add";
		}
		
		for (String fruit : fruits) {
			System.out.println(fruit);
		}
		
		
	}

}
