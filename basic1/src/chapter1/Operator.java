package chapter1;

public class Operator {

	public static void main(String[] args) {

		int a = 15;
		int b = 2;
		double c = 15.0;
		double d = 7.0;
		
		int intResult = 0;
		double doubleResult = 0.0;
		
		
		// 산술 연산자 : 숫자 데이터에 대해 사칙연산을 수행
		
		// 더하기 : +
		// 좌항에 우항을 더한 값을 반환
		intResult = a + b;
		System.out.println(intResult);
		System.out.println(c + d);
		System.out.println(a + c);
		
		// 빼기 : -
		// 좌항에 우항을 뺀 값을 반환
		intResult = a - b;
		System.out.println(intResult);
		doubleResult = c - d;
		System.out.println(doubleResult);
		doubleResult = a - c;
		System.out.println(doubleResult);
		
		// 곱하기 : *
		// 좌항에 우항을 곱한 값을 반환
		intResult = a * b;
		System.out.println(intResult);
		doubleResult = c * d;
		System.out.println(doubleResult);
		doubleResult = a * c;
		System.out.println(doubleResult);
		
		// 나누기 : /
		// 좌항에 우항을 나눈 값을 반환
		// 정수와 정수를 나누면 실수부가 소멸함
		intResult = a / b;
		System.out.println(intResult);
		doubleResult = c / d;
		System.out.println(doubleResult);
		doubleResult = a / d;
		System.out.println(doubleResult);
		
		// 나머지 : %
		// 좌항에 우항을 나눈 나머지를 반환
		intResult = a % b;
		System.out.println(intResult);
		doubleResult = c % d;
		System.out.println(doubleResult);
		
		
		// 증감 연산자
		// 피연산자의 값을 1 증가 혹은 감소
		// 피연산자가 반드시 변수이어야함
		// 증가 연산자 : ++
		// 감소 연산자 : --
		int number = 5;
		number++;
		System.out.println(number);
		number--;
		System.out.println(number);
		System.out.println();
		
		// number = 5
		System.out.println(number++);
		System.out.println(++number);
		System.out.println(number--);
		System.out.println(--number);
		System.out.println();
		
		final int NUMBER = 5;
//		NUMBER++;
//		5++;
		
		
		// 대입 연산자 : 좌항에 우항을 할당
		
		// 일반 대입 연산자 : =
		// 좌항에 우항의 연산 결과를 할당
		// 좌항이 일반 변수와 상수형 변수 모두 올 수 있음
		// 단, 상수형 변수는 초기화 시에만 사용가능
		number = 10 + 5;
		
		// 복합 대입 연산자 : 타연산자(+, -, *, / ...)=
		// 좌항에 좌항과 우항을 연산한 결과를 할당
		// 좌항은 반드시 초기화가 되어있어야 함
		// 좌항은 반드시 일반 변수가 와야함 (상수 불가능)
		number += 3;	// number = number + 3;
		System.out.println(number);
		number /= 7;	// number = number / 7;
		System.out.println(number);
		System.out.println();
		
		
		// 비교 연산자 : 좌항과 우항을 비교하여 그 결과를 논리 값으로 반환
		boolean booleanResult;
		
		// 동등 비교 연산
		// == : 좌항이 우항과 같으면 true, 다르면 false
		
		// 부등 비교 연산
		// != : 좌항이 우항과 같으면 false, 다르면 true
		booleanResult = a == c;
		System.out.println(booleanResult);
		booleanResult = a != c;
		System.out.println(booleanResult);
		System.out.println();
		
		// 작다, 작거나 같다 연산
		// < : 좌항이 우항보다 작으면 true, 크거나 같으면 false
		// <= : 좌항이 우항보다 작거나 같으면 true, 크면 false
		booleanResult = a < c;
		System.out.println(booleanResult);
		booleanResult = a <= c;
		System.out.println(booleanResult);
		System.out.println();
		
		// 크다, 크거나 같다 연산
		// > : 좌항이 우항보다 크면 true, 작거나 같으면 false
		// >= : 좌항이 우항보다 크거나 같으면 true, 작으면 false
		booleanResult = a > c;
		System.out.println(booleanResult);
		booleanResult = a >= c;
		System.out.println(booleanResult);
		System.out.println();

		
		// 논리 연산자 : 피연산자가 모두 논리형태, 피연산자를 조합
		// 논리 AND 연산자 : && - 좌항과 우항이 모두 true이면 true, 하나라도 false이면 false
		booleanResult = true && true;
		System.out.println(booleanResult);
		booleanResult = (a > b) && (a <= c);
		System.out.println(booleanResult);
		System.out.println();
		
		// 논리 OR 연산자 : || - 좌항과 우항이 하나라도 true이면 true, 모두 false이면 false
		booleanResult = false || false;
		System.out.println(booleanResult);
		booleanResult = (a == b) || (c == d);
		System.out.println(booleanResult);
		System.out.println();
		
		// 논리 NOT 연산자 : ! - 피연산자가 true이면 fales, false 이면 true
		System.out.println(!booleanResult);
		System.out.println();
		
		// 아래 내용을 이용해서 제어문을 쓸수 없게되는 상황에서 제어문 처럼 사용가능
		booleanResult = false && (++a > 0);	// AND연산은 좌항이 false 면 우항을 읽지 않음
		System.out.println(a);
		
		booleanResult = (a < b) && (++a > 0);
		System.out.println(a);
		
		booleanResult = true || (++a > 0);	// OR연산은 좌항이 true 면 우항을 읽지 않음
		System.out.println(a);
		
		booleanResult = (a > b) || (++a > 0);
		System.out.println(a);
		System.out.println();
		
		
		// 삼항 연산자 : 조건에 따라 지정한 결과를 반환하는 연산자
		// 조건(논리식) ? 참일때결과 : 거짓일때결과
		int age = 10;
		String stringResult = age > 19 ? "성인" : "미성년자";
		System.out.println(stringResult);
		
		
	}

}
