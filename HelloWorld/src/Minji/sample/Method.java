package Minji.sample;

import java.util.Date;
//외부 클래스 - 자바에서 유용한 기능을 제공하는 랜덤 클래스
import java.util.Random;

public class Method {
	public static void main(String[] args) {

		// 객체 생성하고 쓰기
		// Method m = new Method();
		// m.printPoem();

		printPoem(); // methods 호출 //바로 쓸 수 있음

		System.out.println(add(12, 87));

		// 메서드 사용하기 #1 - 같은 기능이지만 메서드 두 개(따로따로)
		sayHello();
		sayHello2();

		// 메서드 사용하기 #2 - 메서드 하나로 출력 두개
		sayHello3("안녕하세요, 자바!");
		sayHello3("안녕하세요, C#!");

		// #3
		System.out.println(sayHello4("안녕하세요, 파이썬!")); // 밖에 출력

		String hello = sayHello4("안녕하세요, 파이썬!"); // 메서드 실행 //return을 쓰면 다른 변수로 넘겨줌
		hello += "작성일: 2017.11.26 "; // 문자 추가
		System.out.println(hello); // 출력

		// #4
		Date today = sayHello5();
		System.out.println(today);

		// Date 클래스는 deprecate 예정이라 메서드에 취소선 표시
		System.out.println(today.getYear() + 1900);
		System.out.println(today.getMonth() + 1);
		System.out.println(today.getDate());
		System.out.println(today.getHours());
		System.out.println(today.getMinutes());
		System.out.println(today.getSeconds());

		// 로또 메서드 사용
		Lotto645();
		Lotto645();
		Lotto645();
		Lotto645();
		Lotto645();

	}

	// 메서드 선언
	// 어떤 기능을 하는 문장들을 (재사용할 코드를) 블럭 단위로 묶은 후 이름을 붙여 methods를 만듦
	// 가독성과 코드 재사용성을 높이기 위해 사용
	// 접근 지정자 반환값 메서드이름(매개변수목록) {
	// 메서드를 구성하는 문장들
	// }
	// public - 접근 제한 설정(어느정도 수준까지 open할 것인지),
	// static - 객체 생성하지 않고 메서드를 호출할 수 있도록 만들어 줌,
	// void - 반환 유형
	public static void printPoem() {
		System.out.println("기이한 복받치는 감정을 느꼈네");
		System.out.println("그리고 감히 그것을 말하겠네");
		System.out.println("하지만, 연인의 귀에만 하겠네");
		System.out.println("내게 전에 일어났던 것을");
	}

	// 두 개의 정수를 입력받아 합을 구하고 결과를 반환
	public static int add(int num1, int num2) {
		int /* num1,num2, */ sum;
		sum = num1 + num2;
		return sum; // 리턴 값이 없으면 public static void ~
	}

	// 메서드 정의하기 #1 - 매개변수 X, 반환값 X
	public static void sayHello() {
		System.out.println("Hello, Java!");
	}

	public static void sayHello2() {
		System.out.println("Hello, C#!");
	}

	// 메서드 정의하기 #2 - 매개변수 O, 반환값 X
	public static void sayHello3(String msg) {
		System.out.println(msg); // 안에 출력
	}

	// 메서드 정의하기 #3 - 매개변수 O, 반환값 O
	public static String sayHello4(String msg) {
		return msg; // 출력 안하고 값 넘겨주기
	}

	// 메서드 정의하기 #4 - 매개변수 X, 반환값 X
	public static Date sayHello5() {
		// 현재 시간을 계산하여 출력
		return new Date();
	}

	// 로또 생성기를 메서드로 구현 - Lotto645
	public static void Lotto645() {
		int key1, key2, key3, key4, key5, key6;
		Random r = new Random(); // 외부 클래스라서 빨간줄 뜸
									// 랜덤이라는 기능을 추가할 것이라고 컴파일러에게 알려줘야 함
									// import java.util.Random;
		// r.nextInt(45);
		// System.out.println(r.nextInt(45 + 1));

		key1 = r.nextInt(45) + 1;
		key2 = r.nextInt(45) + 1;
		key3 = r.nextInt(45) + 1;
		key4 = r.nextInt(45) + 1;
		key5 = r.nextInt(45) + 1;
		key6 = r.nextInt(45) + 1;

		System.out.printf("%d %d %d %d %d %d \n", key1, key2, key3, key4, key5, key6);
	}

}

class One {

}
