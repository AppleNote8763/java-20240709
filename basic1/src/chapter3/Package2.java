package chapter3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Package2 {
	
	public static void main(String[] args) {
		
		// Collection Framework	: Java에서 테이터 구조에 대한 *표준화된 기법을 제공
		
		// List	: 데이터를 저장할 때 중복을 허용하고 순서가 존재하는 데이터 구조
		// Collection Framework에서 데이터 타입을 지정할 땐 제너릭을 사용하여 지정, *참조형 데이터 타입만 지정가능
		// List<Integer>...
		List<Integer> list;
		
		// ArrayList 구현 클래스	: 인덱스를 이용한 검색이 빠름
		list = new ArrayList<Integer>();	// list = new ArrayList<>();	/	<>안이 비워져 있어도 상관없음
		
		// LinkedList 구현 클래스	: 추가, 삭제가 빠름
		list = new LinkedList<Integer>();	// list = new LinkedList<>();	/	<>안이 비워져 있어도 상관없음
		
		// add()	: List에 요소추가
		// 추가할 요소는 제너릭으로 지정한 데이터타입의 요소
		list.add(99);
//		list.add("99");		// list를 생성할때 List<Integer> list;	/	Integer로 지정했기 때문에 정수만 가능
		System.out.println(list);
		
		list.add(100);
		System.out.println(list);
		
		// get()	: List의 특정 인덱스 값을 가져옴
		// List의 인덱스의 범위를 초과하지 않도록 주의
		// 기본형 데이터 타입 변수로 반환값을 받을 땐 null이 올 수 있음을 주의
		int number = list.get(0);
		System.out.println(number);
		
		// set()	: List의 특정 인덱스 요소를 변경
		// List 인덱스 범위를 벗어나는 인덱스를 지정할 수 없음
		list.set(1, -100);
		System.out.println(list);
		
		// remove()	: List의 특정 인덱스 요소를 제거
		list.remove(0);
		System.out.println(list);
		System.out.println();
		
		List<String> stringsList = new ArrayList<String>();
		stringsList.add("apple");
		stringsList.add("banana");
		stringsList.add("apple");
		System.out.println(stringsList);
		
		stringsList.remove("apple");
		System.out.println(stringsList);
		
		stringsList.remove("aaaa");	// 없는 값을 넣으면 아무것도 잃어나지 않음
		System.out.println(stringsList);
		
		// size()	: List의 크기를 반환
		System.out.println(list.size());
		System.out.println();
		
		
		
		// Set	: 데이터를 저장할 때 중복을 허용하지 않고 순서가 존재하지 않는 데이터 구조 (집합)
		Set<String> set;
		
		// HashSet 구현 클래스	: 검색이 빠름	/	요소를 무작위로 추가
		set = new HashSet<String>();	// set = new HashSet<>();	/	<>안이 비워져 있어도 상관없음
		
		// TreeSet 구현 클래스	: 요소를 정렬해서 추가
		set = new TreeSet<String>();	// set = new TreeSet<>();	/	<>안이 비워져 있어도 상관없음
		
		// add()		: Set에 요소를 추가함 만약에 동일한 요소가 존재한다면 추가하지 않음
		set.add("apple");
		System.out.println(set);
		set.add("banana");
		System.out.println(set);
		set.add("apple");
		System.out.println(set);	// 이미 apple가 존재 하기 때문에 추가되지 않는다
		
		// contains()	: Set에 특정 요소가 존재하는지 확인
		System.out.println(set.contains("apple"));
		
		// remove()		: Set에 특정 요소를 제거
		set.remove("apple");
		System.out.println(set);
		System.out.println();
		
		
		
		// Map	: 키와 값이 한 쌍으로 이루어진 요소들의 집합
		// 키는 중복이 불가능, 값은 중복이 가능
		Map<String, String> map;
		
		// HashMap 구현 클래스	: 검색 속도가 빠름
		map = new HashMap<String, String>();	// map = new HashMap<>();	/	<>안이 비워져 있어도 상관없음
		// TreeMap 구현 클래스	: 키를 정렬하여 저장
		map = new TreeMap<String, String>();	// map = new TreeMap<>();	/	<>안이 비워져 있어도 상관없음
		
		// put()	: Map에 키와 값의 쌍을 추가
		// 만약 동일한 키가 존재하면 원래 값을 덮어씌움
		map.put("Apple", "사과");
		System.out.println(map);
		map.put("Banana", "바나나");
		System.out.println(map);
		map.put("Banana", "버네이너");
		System.out.println(map);
		
		// get()	: Map에서 특정 키를 가지는 요소를 반환
		System.out.println(map.get("Apple"));
		System.out.println(map.get("apple"));
		
		// containsKey()	: Map에 특정 키가 존재하는지 확인
		System.out.println(map.containsKey("Apple"));
		System.out.println(map.containsKey("apple"));
		
		// remove()	: Map에서 특정 키를 가지는 키와 값의 쌍을 제거
		// 삭제 작업에 성공하면 해당 키의 값을 반환
		System.out.println(map.remove("Apple"));
		System.out.println(map);
		System.out.println();
		
		
		
		class Human {
			String name;
			String address;
			int age;
		}
		
		Human human1 = new Human();
		human1.name = "홍길동";
		human1.address = "부산광역시";
		human1.age = 20;
		System.out.println(human1.name);
		System.out.println(human1.address);
		System.out.println(human1.age);
		
		Map<String, Object> human2 = new HashMap<String, Object>();
		human2.put("naem", "홍길동");	// 일부러 name를 naem으로 오타냄
		human2.put("address", "부산광역시");
		human2.put("age", 20);
		System.out.println(human2);
		
		// 1. 문제점 : 사용 혹은 추가 작업에 실수 가능성
		human2.get("name");		// 여기서는 name에 오타를 내지 않음
		// 2. 문제점 : 타입의 안정성의 문제
		int age = (int) human2.get("age");
		// 3. 문제점 : 데이터 무결성의 문제
		
		
	}
	
}
