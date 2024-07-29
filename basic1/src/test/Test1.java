package test;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		int[] numList = new int[] {12, 4, 15, 46, 38, -2, 15};
		
		System.out.println(solution.solution(numList));
		
		int[] array = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
		
		int[] result = solution.solution(array, queries);
		
		System.out.println(Arrays.toString(result));
		
		int number = 123456789;
		
		System.out.println(solution.solution(number));
		
	}
	
}
