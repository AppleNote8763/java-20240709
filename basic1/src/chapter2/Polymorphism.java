package chapter2;

// 다형성 : 하나의 표현으로 여러가지 형태를 나타낼 수 있는 것

// 오버로딩		: 같은 클래스 내부에서 동일한 이름의 메서드를 여러개 정의할 수 있도록 하는 것
// 오버라이딩	: 자손 클래스에서 조상 클래스에 정의된 메서드를 재정의 하는것

// 업캐스팅		: 하위 클래스의 객체를 상위 클래스 혹은 구현된 인터페이스 타입의 변수에 담을 수 있도록 하는 것
// 다운캐스팅	: '업캐스팅'된 객체를 다시 원래 타입의 변수에 담을 수 있도록 하는 것

class Human3 {
	String name;
	int age;
	
	public Human3(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

interface FootballPlay {
	void kick();
	void foul();
}

class FootballPlayer extends Human3 implements FootballPlay {
	String team;

	public FootballPlayer(String name, int age, String team) {
		super(name, age);
		this.team = team;
	}

	@Override
	public void kick() {
		System.out.println(name + "가 킥을 합니다.");
	}

	@Override
	public void foul() {
		System.out.println(name + "가 파울을 했습니다.");
	}
}

public class Polymorphism {

	public static void main(String[] args) {

		Human3 human = new Human3("홍길동", 20);
		
		FootballPlayer footballPlayer = new FootballPlayer("이성계", 24, "대한민국");
		
		System.out.println("업캐스팅 Human3 human2 = footballPlayer");
		Human3 human2 = footballPlayer;		// 업캐스팅	Human3가 name, age 만 가지고 있어서 둘만 사용가능 / 실제 다른 값을 가지고는 있음
		System.out.println(human2.name);
		System.out.println(human2.age);
//		System.out.println(human2.team);
//		human2.kick();
		System.out.println();
		
		System.out.println("업캐스팅 FootballPlay footballPlay = footballPlayer");
		FootballPlay footballPlay = footballPlayer;		// 업캐스팅 FootballPlay가 kick(), foul()만 가지고있어서 둘만 사용가능 / 실제 다른 값을 가지고는 있음
		footballPlay.kick();
		footballPlay.foul();
		System.out.println();
		
//		System.out.println(footballPlay.name);	// 인터페이스 상에서는 구현되어 있지않아 name, age를 확인할 수 없음
//		System.out.println(footballPlay.age);
		
		System.out.println("다운캐스팅 FootballPlayer footballPlayer2 = (FootballPlayer) human2");
		FootballPlayer footballPlayer2 = (FootballPlayer) human2;	// 다운캐스팅
		System.out.println(footballPlayer2.name);
		System.out.println(footballPlayer2.age);
		System.out.println(footballPlayer2.team);
		footballPlayer2.kick();
		footballPlayer2.foul();
		System.out.println();
		
		System.out.println("다운캐스팅 FootballPlayer footballPlayer3 = (FootballPlayer) footballPlay;");
		FootballPlayer footballPlayer3 = (FootballPlayer) footballPlay;	// 다운캐스팅
		System.out.println(footballPlayer3.name);
		System.out.println(footballPlayer3.age);
		System.out.println(footballPlayer3.team);
		footballPlayer3.kick();
		footballPlayer3.foul();
		
//		FootballPlayer footballPlayer4 = (FootballPlayer) human;	// 다운캐스팅시 team, kick(), foul()을 가지고 있지 않아 코드상으로는 오류가 뜨지 않지만 실제실행시 오류가남
//		System.out.println(footballPlayer4.name);					// 예외라고 한다
//		System.out.println(footballPlayer4.age);
//		System.out.println(footballPlayer4.team);
//		footballPlayer4.kick();
//		footballPlayer4.foul();
		
		Object object1 = human;				// 뭐든지 다 받을수 있는 타입 Object 를 이용한 업캐스팅
		Object object2 = footballPlayer;
		Object object3 = 3;
		
		
	}

	void method(Object object) {
		
		// 매개변수나 반환 타입으로 Object 타입을 지정하게 되면 해당 인스턴스 사용시
		// 문제(강제 다운캐스팅시 타입 불일치)가 발생할 수 있음
		// 사용을 지양해야함
		
//		object;
		
	}
	
	
}
