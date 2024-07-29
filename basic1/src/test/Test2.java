package test;

public class Test2 {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		int[] array = {0, 1, 2, 3, 4};
		int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
		
		int[] result = solution.solution(array, queries);
		
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
		}
		
	}

}
