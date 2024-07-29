package t1;

public class T1 {

	public static void main(String[] args) {
		// 5 x 5 배열
		// 5 4 4 3 3 2 2 1 1	// 나아갈 수 있는 방향
		// 1 2 3 4 5 6 7 8 9	// 나아간 횟수
		// 5 배열 한줄의 크기
		// 짝수번 마다 줄어듬
		// 12345 / 6789 / 891011 / 121314 ...
		//	/1		/2		/3		/4	...
		
//		System.out.print(num + " ");
//		if (num % (wall - num2) == 0) {
//			System.out.println("/");
//		}
		
		int num1 = 0;
		int num2 = 4;
		int num3 = 0;
		int count = 5;
		int[] numbers = new int[25];
		
//		int wall = 5;
//		int j = 0;
//		for (int i = 0; i < 25; i++) {
//			int num = i + 1;
//			System.out.print(num + " ");
//			System.out.println(num % wall + " ");
//			if (num % wall == 0) {
//				System.out.println("/");
//				j++;
//				System.out.println(j % 2);
//				if (j % 2 == 0) {
//					wall++;
//				}
//			}
//		}		
		

//		5	9	13	16	19	21	23	24
//		5	4	4	3	3	2	2	1
//		--		--		--		--	
//		+4	+4	+3	+3	+2	+2	+1	+1
//		1	2	3	4	5	6	7	8
//		1		3		5		7
		
		
		for (int i = 0; i < 25; i++) {
			num1 = i + 1;
			System.out.print(num1);
			numbers[i] = num1;
//			if(num1 == 5 || num1 == 9 || num1 == 13 || num1 == 16 || num1 == 19 || num1 == 21 || num1 == 23 || num1 == 24) {
//				System.out.println("/");
//			}
			if(num1 == count) {
				System.out.println("/");
				count += num2;
				num3++;
				if(num3 % 2 == 0) {
					num2--;
				}
			}
			
		}
		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		
		int[] arr = { 1, 2, 3, 4, 5 };         
		for (int i = 0; i < numbers.length; i++) {            
			System.out.println(numbers[i]);
		}
		
		
	}
	
}
