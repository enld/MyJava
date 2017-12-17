package Minji.sample;

public class Class {
	// 배열 vs 구조체 vs 클래스
	// 배열: 동일한 자료형을 가지는 데이터들을 하나로 묶음
	// 구조체: 서로 다른 자료형의 데이터들을 하나로 묶음
	// 클래스: 서로 다른 자료형의 데이터들과
	// 그것과 관련된 메서드들을 하나로 묶음

	public static void main(String[] args) {

		// #2 객체 생성
		Human1 song;
		song = new Human1();

		Human1 jeon = new Human1();

		// #3 객체 다루기
		song.name = "혜교";
		song.gender = '여';
		song.age = 37;

		jeon.name = "지현";
		jeon.gender = '여';
		jeon.age = 35;

		// #4 객체 출력
		System.out.println(song);
		System.out.println(song.name);
		System.out.println(song.gender);
		System.out.println(song.age);
	}

}

// #1 클래스 선언
class Human1 {
	// 필드 선언 - 인스턴스 변수 // 변수를 메인이 아니라 클래스 안에 선언
	String name;
	int age;
	char gender;

}

// 모델링하기!!
// 학생 클래스 - 이름, 학년반, 국어, 영어 , 수학
class Student {
	String name, hakbun;
	int kor, eng, mat;

}

// 쇼핑몰
// 회원 member 클래스 - 아이디, 비번, 이름, 이메일, 주소 -(우편번호, 시, 도.. -> 클래스로 따로 분리! 정규화!)
class Member {
	String userUd, passwd, name, email, address;
}

// 상품 product 클래스 - 상품명, 가격 (정상가, 할인가...), 카테고리, 재고, 사이즈
class Product {
	String prodName, category, size;
	int price, qty;
}

// 주문 order 클래스 - 주문자, 주문상품, 주문수량, 주문일, 배송지, 총금액
class Order {
	String userId; // Member 클래스
	String prodName; // Product 클래스
	int qty;
	String oderDate;
	String oderDest;
	String oderPrice;
}

// 수강신청
// 학생 College - 이름, 학번, 전공, 주소, 전화번호
class College {
	String stdName, filed;
	int stId, adress, phone;

}

// 과목 Course - 과목명, 담당교수, 강의실, 강의시간, 분류, 정원
class Course {
	String subName, proName, roomNo, courseTime, category;
	int qty;

}

// 수강 Enroll - 이름, 과목명, 수강신청일
class Enroll {
	String stdName;
	String subName;
	String enrollDate;
}
