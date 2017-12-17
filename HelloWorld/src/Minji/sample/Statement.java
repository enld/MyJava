package Minji.sample;

import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {

		{

		} // 빈블록

		// 변수의 유효범위
		// 블록 내 선언한 변수는 지역변수
		// 지역변수는 해당 블록을 벗어나면 사용 불가
		// 변수의 유효범위scope를 주의함
		{
			int int1 = 20; // 블록 내 변수선언 -> 메모리를 빌림
			++int1; // 사용 가능

		} // -> 메모리 반납

		int int2; // 블록 밖 변수선언
		{

			int2 = 55; // 사용 가능

		}

		// 블록 두 개
		{
			int int3 = 10;
			{
				int3 = 45;
				int int4 = 50;
				int4 = 90;

			}
			// int4 = 125; // int4 사용 불가능 (블록 안에서 선언한 변수를 밖에서 호출 불가능) (지역변수)
			int int4 = 125;
		}
		// int3 = 150; //지역변수

		// 조건문
		int num1 = 3;
		if (num1 > 0) { // 조건식의 결과가 참이면
			System.out.println("0보다 큼"); // 실행
		} else { // 조건식의 결과가 참이 아니면
			System.out.println("0보다 작음");
		}

		// 짝수인지 아닌지 조건문
		int num2 = 5;
		if (num2 % 2 == 0) {
			System.out.printf("%d는 짝수입니다 \n", num2);
		} else {
			System.out.printf("%d는 홀수입니다 \n", num2);
		}

		// 5의 배수인지 아닌지 조건문
		int num3 = 5;
		if (num3 % 5 == 0) {
			System.out.printf("%d는 5의 배수입니다 \n", num3);
		} else {
			System.out.printf("%d는 5의 배수가 아닙니다 \n", num3);
		}

		// 제어문에서 조건문의 중요성
		if (true) {
			;
			;
		} else
			; // 문장이 하나인 경우 { }는 생략 가능

		// 중첩 if 문
		num1 = 55;
		if (num1 % 5 == 0) {
			System.out.printf("%d는 짝수입니다 \n", num2);
			if (num2 % 2 == 0) {
				System.out.printf("%d는 짝수입니다 \n", num2);
			} else {
				System.out.printf("%d는 홀수입니다 \n", num2);
			}
		} else {
			System.out.printf("%d는 홀수입니다 \n", num2);
		}

		// 아이디, 비밀번호 체크 -> "두 개 동시에 맞는지"
		// 아이디/비번 일치 - 로그인 성공!
		// 아이디/비번 일치 안함 - 로그인 실패!
		// 아이디: apple 비번: java
		String userid = "abc";
		String passwd = "987";

		// && 논리 연산자 사용
		if (userid.equals("apple") && passwd.equals("java")) { // String은 값 자체가 아니라 주소 값을 비교함
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}

		// 중첩 if문 - 실제로는 해커의 공격 대상이 될 수 있으므로 무엇이 잘못 되었는지 알려주지 않음
		if (userid.equals("apple")) {
			if (passwd.equals("java")) {
				System.out.println("로그인 성공!");
			} else {
				System.out.println("로그인 실패! 비밀번호가 틀립니다!");
			}
		} else {
			System.out.println("로그인 실패! 아이디가 틀립니다!");
		}

		// 애매한 if문
		if (num1 % 5 == 0) {
			if (num1 % 2 == 0)
				System.out.println("5의 배수 & 2의 배수");
		} else {
			System.out.println("5의 배수 아님");

		}

		// 학점 계산 -> "각각 따로 따로"
		// 평균 90이상: A
		// 평균 80이상: B
		// 평균 70이상: C
		// 평균 60이상: D
		// 기타: F
		double avg = 95.4;
		char grd = 'F';
		if (avg >= 90) {
			grd = 'A';
		} else if (avg >= 80) {
			grd = 'B';
		} else if (avg >= 70) {
			grd = 'C';
		} else if (avg >= 60) {
			grd = 'D';
		} else {
			grd = 'F';
		}
		// System.out.printf("%d 학점입니다", grd);

		// switch: 다중 if문을 세련된 조건식으로 작성
		int num4 = 11;
		switch (num4 % 2) { // 표현식만 씀!! 결과는 case문에 // 수식의 결과값이 정수
		case 0:
			System.out.println("2의 배수");
			break; // 여기까지만 실행, switch 문 밖으로 벗어남 // break문을 쓰지 않으면 순차구조이기 때문에 결과가 두 개 나옴
		case 1:
			System.out.println("2의 배수 아님");
			break;
		}

		// switch문의 수식은 double은 사용 불가
		// double tmp = 1.1;
		// switch(tmp) {
		// }

		// 문자열도 입력 받을 수 있음
		String days = "월요일";
		switch (days) {
		case "월요일":
			System.out.println("회사에 출근하는 날..");
			break;
		case "금요일":
			System.out.println("불금!!");
			break;
		case "일요일":
			System.out.println("놀기!!");
			break;
		}

		// 성적 처리 switch문으로
		double avg1 = 87.5;
		grd = 'A';
		switch ((int) avg1 / 10) { // 형변환, 10으로 나눠서 범위를 지정한다
		case 10:
			grd = 'A';
			break;
		case 9: // 99~90
			grd = 'A';
			break;
		case 8:
			grd = 'B';
			break;
		case 7:
			grd = 'C';
			break;
		case 6:
			grd = 'D';
			break;
		default:
			grd = 'F';
			break;
		}
		System.out.printf("학점은 %s입니다 \n", grd);

		// 반복 처리
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");
		System.out.println("안녕하세요!");

		// for문
		// 반복문 내 변수명은 i,j,k,l,m 등을 사용
		for (int i = 1; i <= 100; ++i) { // 1부터 100까지 1씩 증가
			// 반복실행할 코드
			System.out.println("안녕하세요!");
		}

		// 1부터 100사이 짝수만 출력 -> 100번 반복
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// 다른 방법 - 2씩 증가시켜서 -> 50번 반복
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}

		// 1부터 500사이 5의 배수 출력 -> 500번 반복
		for (int i = 1; i <= 500; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}

		// 다른 방법 -> 100번 반복
		for (int i = 5; i <= 500; i += 5) { // i = 501이면 false가 되어 반복문 중지
			System.out.println(i);
		}

		// 무한반복문 - 초기식, 조건식, 증감식을 ;으로 작성시
		// for (;;) {
		// ;
		// }

		// 반복문에 break, continue 사용하기
		// 반복문 정상 종료할 때 - 조건식이 거짓
		// 반복문 강제 종료 - break문 사용
		// 반복문 일시적으로 건너뛸 때 - continue문 사용
		// runtime오류
		for (int i = 0; i <= 100; ++i) {
			i = 999; // 반복실행 종료를 위한 문장
			System.out.println(i); // 실행됨 // 실행된 후 i = 1000 -> 종료
		}

		for (int i = 0; i <= 100; ++i) {
			System.out.println(i);
			break; // 반복실행 강제 종료 - 아래 문장 실행 안됨
			// System.out.println(i); // 실행될 수 없음 반복문이 break문에 의해 종료됨
		}

		for (int i = 0; i <= 100; ++i) {
			// continue; // 반복문 일시적으로 건너 뜀 아래 문장 실행 안됨
			if (i % 3 != 0)
				continue;
			System.out.println(i); // 실행될 수 없음 반복문이 continue문에 의해 i <= 100 조건문으로 돌아가서 무한 반복
		}

		// 중첩 for문
		// 구구단 중 5단 출력
		// 5 X 1 = 5
		// 5 X 2 = 10
		// 5 X 3 = 15
		// 5 X 4 = 20
		// ...
		// 5 X 19 = 95
		for (int i = 1; i <= 19; i++) {
			System.out.printf("5 X %d = %d \n", i, 5 * i);
		}

		// 십구구단 중 14, 15, 16단 출력
		// 14 X 1 = 14 15 X 1 = 15 16 X 1 =16
		// ...
		// 14 X 19 = 14 15 X 19 = 15 16 X 19 = 16
		// System.out.printf(" X %d = %d \n", i, i);
		for (int j = 14; j <= 19; j++) {
			for (int i = 1; i <= 20; i++) {
				System.out.printf("%2d X %2d = %3d \t", i, j, i * j);
			}
			System.out.println();
		}

		for (int i = 1; i <= 20; i++) {
			for (int j = 14; j <= 19; j++) {
				System.out.printf("%2d X %2d = %3d \t", i, j, i * j);
			}
			System.out.println();
		}

		// 반복되는 것을 찾아가면서 코딩하자!
		// for (int i = 1; i <= 20; i++) {
		// System.out.printf(" 14 X %2d = %3d \t", i, 14 * i);
		// System.out.printf(" 15 X %2d = %3d \t", i, 14 * i);
		// System.out.printf(" 16 X %2d = %3d \t", i, 14 * i);
		// System.out.printf(" 17 X %2d = %3d \t", i, 14 * i);
		// System.out.printf(" 18 X %2d = %3d \n", i, 14 * i);
		// System.out.printf(" 18 X %2d = %3d \n", i, 14 * i);
		// }

		// 중첩 이용하기
		// *
		// **
		// ***
		// ****
		// *****

		// *****
		// ****
		// ***
		// **
		// *

		// while - 조건에 의해 반복실행
		// while (true) { // 무한루프
		// System.out.println("안녕하세요");

		// }

		// while (false) { // 실행할 수 없는 반복문
		// System.out.println("이글이 보이시나요?");
		// }

		// 1 ~ 100 출력
		int i = 1; // 초기화
		while (i <= 100) { // 조건식
			System.out.println("i");
			++i; // 증감식
		}

		// 1부터 100사이 홀수 출력
		int j = 1; // 초기화
		while (j <= 100) { // 조건식
			System.out.printf("%d \n", j);
			j += 2; // 증감식
		}

		// 1부터 100사이 5의 배수 출력
		int k = 0; // 초기화
		while (k <= 100) { // 조건식
			System.out.printf("%d \n", k);
			k += 5; // 증감식
		}

		// 1000부터 1까지 7의 배수 출력
		int l = 1000;
		while (l >= 1) {
			if (l % 7 == 0)
				System.out.printf("%d \n", l);
			--l;
		} // 나머지 연산자

		// 다른 방법
		l = 994;
		while (l >= 1) {
			System.out.println(l);
			l -= 7;
		}

		// while문에서 break 사용
		// 1 ~ 100 사이 짝수 출력
		// 단, 82까지 출력하면 반복문 종료
		int m = 2;
		while (m <= 100) {
			if (m > 82)
				break;
			System.out.println(m);
			m += 2;
		}

		// do - while: do안의 반복 문장을 먼저 실행하고 반복 조건 검사
		// 1 ~ 100사이 홀수 출력
		m = 1; // 초기화
		do {
			System.out.println(m);
			m += 2; // 증감식
		} while (m <= 100); // 조건식

		// Scanner를 이용하여 외부입력 처리
		Scanner sc = new Scanner(System.in);
		int month;
		do {
			System.out.println("월을 입력하세요");
			month = sc.nextInt(); // 정수를 입력 받음

			// 종료
			if (month == 0) {
				System.out.println("do-while 종료");
				break;
			}

			System.out.printf("당신은 %d 월을 입력하셨네요! \n", month);
		} while (month > 1 || month < 12);
		sc.close(); // 키입력 종료 - 자원 해제

		// continue가 있으면 바로 조건식으로 넘어간다 //아래 코드를 실행하지 않음

	}
}
