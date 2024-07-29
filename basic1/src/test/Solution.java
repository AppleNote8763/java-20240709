package test;

public class Solution {
	
	public int solution(int[] idx) {
		for (int i = 0; i < idx.length; i++) {
			if (idx[i] < 0) {
				return i;
			}
		}
		return -1;
	}
	
	public int[] solution(int[] array, int[][] queries) {
		
		for (int i = 0; i < queries.length; i++) {
			for (int j = queries[i][0]; j < queries[i][1] +1; j++) {
                array[j]++;
            }
		}
		return array;
	}
	
	public int solution(int number) {
		int sum = 0;
		
		if (number < 0) {
			return 0;
		}else {
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			return sum;
		}
	}
	
}
