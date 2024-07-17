package chapter1;

public class ControllEtc {

	public static void main(String[] args) {

		// contuinue : 반복문에서 continue를 만나면 조건 검사로 넘어감
		// break : 반복문에서 break를 만나면 반복문을 종료함
		// continue, break 문은 조건문과 같이 사용됨
		
		// count가 3의 배수가 아니면 출력
		// count가 4의 배수이면서 11의 배수이면 반복을 종료
		for (int count = 0; count < 100; count++) {
			int number = count + 1;
			boolean fristCondition = number % 3 == 0;
			boolean secondCondition = number % 4 == 0 && number % 11 == 0;
			
			if (fristCondition) {
				continue;
			}else if (secondCondition) {
				break;
			}
			System.out.println(number);
		}
		
		
	}

}
