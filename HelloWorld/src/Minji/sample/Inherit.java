package Minji.sample;

public class Inherit {
	public static void main(String[] args) {

		// 객체 생성
		Eagle e1 = new Eagle();
		e1.eat();
		e1.sleep();
		e1.fly();

		Tiger t1 = new Tiger();
		t1.eat();
		t1.sleep();
		t1.run();

		GoldFish g1 = new GoldFish();
		g1.eat();
		g1.sleep();
		g1.swim();

		// 부모 클래스를 객체화 - p347 추상클래스: 부모 클래스의 객체화를 막음 abstract class Amimal { }
		// 부모 클래스를 객체화하지 못하게 만들고 싶다면
		// 추상 클래스로 만든다
		Animal a1 = new Animal();
		a1.eat();
		a1.sleep();

		// 다형성 - 타입 형변환
		// 상속관계에 있는 자식 클래스 객체는
		// 부모 클래스의 타입으로 변환 가능
		// '자식 -> 부모' 형변환 가능
		Animal a = e1;
		a = t1;
		a = g1;

		// 다운캐스팅 -> '작은범위(자식) 큰범위(부모)로 변환'하는 것은 문제!!
		// 그러므로 명시적 캐스팅 사용

		// Tiger t = a;
		// ??Tiger t = (Tiger) a;
		// GoldFish g = a;
		// ??GoldFish g = (GoldFish) a;
		// Eagel e = a;
		// ??Eagle e = (Eagle) a;
	}

}

class Animal {
	// 변수 선언
	private String eye, mouth;

	// 생성자
	public Animal() {
	}

	// 메소드
	public void eat() {
		System.out.println("지금은 먹는중");
	}

	public void sleep() {
		System.out.println("지금은 자는중");
	}
}

class Eagle extends Animal {
	private String wing;

	public void fly() {
		System.out.println("지금은 나는 중");
	}
}

class Tiger extends Animal {
	public void run() {
		System.out.println("지금은 걷는 중");
	}
}

class GoldFish extends Animal {
	public String fin;

	public void swim() {
		System.out.println("지금은 헤엄치는 중");
	}
}

class User {
	private String userid;
	private String passwd;
	private String addr;
	private Zipcode zip; // User(사용자)는 Zipcode(주소정보)를 갖고 있다 -> has-a 관계 형성
}

class Zipcode {
	private String zipcode;
	private String sido;
	private String gugun;
	private String dong;
	private String bunji;

}

class Device {
	// private String name; // 자식 클래스의 return에서 접근 불가 -> 1) set/get을 만들거나 2)
	// protected로
	protected String name;
}

class Camera extends Device {
	public String showName() {
		return name;
	}
}