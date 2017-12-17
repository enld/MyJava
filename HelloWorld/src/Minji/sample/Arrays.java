package Minji.sample;

import java.util.Random;

public class Arrays {
	public static void main(String[] args) {
		// 학생 1명
		// name, kor, eng, mat

		// 학생 3명
		// name1, kor1, eng1, mat1
		// name2, kor2, eng2, mat2
		// name3, kor3, eng3, mat3

		// 배열선언
		String[] name;
		int kor[], eng[], mat[];

		// String name; //메모리 공간 확보
		// name = "혜교"; //값을 메모리에 저장

		// name = new String();
		// name = "혜교";

		// name = "혜교"; //배열의 경우 오류 - 데이터가 저장될 공간이 확보되지 않음

		// 배열은 참조형이며 객체이므로 변수 선언 시 new 연산자로 메모리 영역을 생성해야 함
		// 참조타입 - heap은 장소 stack은 위치를 가리킴
		name = new String[3]; // 3 - 배열의 크기 //3명의 이름을 저장할 공간 생성 // new type [size];
		kor = new int[3];
		eng = new int[3];
		mat = new int[3];

		// 배열의 크기는 상수(final)로 정의 가능
		final int SJSIZE = 3; // 수정이 용이함
		int tot[] = new int[SJSIZE];
		double avg[] = new double[SJSIZE];
		char grd[] = new char[SJSIZE];

		// 배열에 데이터 저장
		name[0] = "혜교"; // 첫 번째 name 요소
		name[1] = "지현";
		name[2] = "수지";

		kor[0] = 90;
		kor[1] = 80;
		kor[2] = 70;

		eng[0] = 90;
		eng[1] = 80;
		eng[2] = 70;

		mat[0] = 90;
		mat[1] = 80;
		mat[2] = 70;

		// 배열의 크기 알아보기: length
		System.out.println(name.length);
		System.out.println(kor.length);
		System.out.println(eng.length);
		System.out.println(mat.length);

		int age[] = null; // 배열이 생성되지 않음
		// int age_size = age.length; // new 연사자를 사용하지 않은 상태에서는 배열이 생성되지 않았기 때문에
		// 배열의 크기length를 알 수 없음

		// 배열 내 데이터 출력
		System.out.println("학생 #1: " + name[0]);
		System.out.println("학생 #2: " + name[1]);
		System.out.println("학생 #3: " + name[2]);

		// 효율적인 출력 방법
		for (int i = 0; i <= 2; i++) {
			System.out.println("학생 #" + (i + 1) + "국어 점수:" + kor[i]);
			// System.out.printf(국어 #%d %d \n, i, kor[i]);
			// i <= 2 대신 i < kor.length으로 변경 OR i <= kor.length -1으로 변경 OR i < SJSIZE
		}

		for (int i = 0; i <= 2; i++) {
			System.out.println("학생 #" + (i + 1) + "영어 점수:" + eng[i]);
		}

		for (int i = 0; i <= 2; i++) {
			System.out.println("학생 #" + (i + 1) + "수학 점수:" + mat[i]);
		}

		for (int i = 0; i <= 2; i++) {
			System.out.println("학생 #" + (i + 1) + "수학 점수:" + mat[i]);
		}

		// 배열 초기화
		// 배열 생성 시 자동적으로 선언 시 타입과 동일
		// 기본값이 초기화된다
		// int double -0
		// boolean - false
		// String -
		// 클래스 -
		int[] intArray = new int[3];
		boolean[] boolArray = new boolean[2];
		String[] strArray = new String[2]; // 참조타입은 모두 null로!!
		Person[] person = new Person[100]; // 클래스 ?

		System.out.println("숫자배열 기본값:" + intArray[0]);
		System.out.println("논리배열 기본값:" + boolArray[0]);
		System.out.println("문자배열 기본값:" + strArray[0]);
		System.out.println("객체배열 기본값:" + person[0]);

		// 명시적 배열 초기화
		String[] userid; // 배열 선언
		// userid = {"abc123", "def456", "ghi789"}; //오류
		userid = new String[] { "abc123", "def456", "ghi789" }; // 배열 생성 -> 나누어 쓸 때

		String[] passwd = { "abc123", "def456", "ghi789", }; // 배열 선언, 생성 같이 쓸 때

		// 배열의 index가 실제 배열크기보다 크면? - 오류 발생 - ArrayIndexOutOfBounds
		// System.out.println(passwd[5]);

		// 배열의 단점
		// 배열의 크기가 한번 결정되면 나중에 다시 수정 불가
		int[] number = new int[100];
		number[99] = 9999;
		// number[100] = 100000; // 오류
		number = new int[1000];

		// 로또 생성기 - 배열 X
		// 1~ 45 사이 6개의 임의의 숫자 추출
		// 중복 불가
		int key1, key2, key3, key4, key5, key6;
		Random r = new Random(); // 클래스
		r.nextInt(45); // 난수 생성
		System.out.println(Math.random()); // 0 - 99 사이의 숫자가 나옴
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(45 + 1)); // 45: bound 지정 //0 - 44 사이의 숫자가 나옴 //45+1: 0 - 45

		key1 = r.nextInt(45) + 1;
		key2 = r.nextInt(45) + 1;
		key3 = r.nextInt(45) + 1;
		key4 = r.nextInt(45) + 1;
		key5 = r.nextInt(45) + 1;
		key6 = r.nextInt(45) + 1;

		System.out.printf("%d %d %d %d %d %d \n", key1, key2, key3, key4, key5, key6);

		// 로또 생성기 - 배열 O

	}
}

class Person {
}
