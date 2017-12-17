package Minji.sample;

public class Constructor {
	public static void main(String[] args) {
		Human3 person = new Human3();

		// 생성자를 통해 멤버변수에 값을 초기화함 (기본값)
		System.out.println(person.name);
		System.out.println(person.age);

		// 객체 생성할 때 바로 초기화!!
		Human3 p1 = new Human3(); // 영희, 10
		Human3 p2 = new Human3("철수"); // 철수, 10
		Human3 p3 = new Human3(20); // 영희, 20
		Human3 p4 = new Human3("혜교", 25); // 혜교, 25

		// 접근제어
		// Human3의 멤버는 default 접근제어 적용 -> 세모
		// 패키지 내 클래스에서 접근 가능
		p1.name = "수지";
		p1.age = 30;

		// Human5의 멤버는 private 으로 선언
		// 따라서 Human5에 선언된 변수는
		// Constructor 클래스에서는 볼 수 없음
		Human5 p5 = new Human5(); // 객체 생성
		// p5.name = "지현";
		// p5.age = 25;

		// Human6의 멤버는 public 으로 선언 -> 동그라미
		Human6 p6 = new Human6();
		p6.name = "지현";
		p6.age = 30;

		// private으로 선언된 멤버변수에 접근하려면?
		// setter/getter 메서드를 사용
		// setXxx() / getXxx() : Xxx는 변수명
	}
}

// default 클래스
class Human3 {
	String name;
	int age;

	// 생성자
	public Human3() {
		this("영희", 10);
		name = "영희";
		age = 10;
	}

	// 또 다른 유형의 생성자
	public Human3(String pname) {
		name = pname;
	}

	public Human3(int age) {
		this.age = age; // 앞의 age는 클래스 변수 age이고 뒤의 age는 매개변수 -> 뒤 변수때문에 앞의 변수가 가려짐 -> shadow!! -> 앞의 변수를
						// this.age로
	}

	public Human3(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 생성자를 여러 형태로 정의하는 것을 생성자 다중정의(overloading)라 함

	// 생성자를 통해 멤버변수에 값을 초기화했음!!

}

class CallConstruct {
	String msg;

	public CallConstruct() {
		// msg = "테스트";
		// CallConstruct("테스트"); // 오류
		this("테스트"); // 매개변수가 문자타입이니까 그것과 일치하는 아래의 메소드 호출
	}

	public CallConstruct(String msg) {
		this.msg = msg;
	}

}

class Human4 {
	String name;
	int age;

	// 기본 생성자에서 초기화
	public Human4() {
		this("혜교", 99);
	}

	public Human4(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human4(String name) {
		this(name, 99);
	}

	public Human4(int age) {
		this("혜교", age); // 현재 클래스 내에 생성된 생성자를 호출할 때 this를 씀
	}

}

class Human5 {
	private String name;
	private int age;
}

class Human6 {
	public String name;
	public int age;
}