package Minji.sample;

public class Operator {
	public static void main(String[] args) {

		// 연산자

		// 대입연산자 =
		int int1; // 변수 선언
		int1 = 25; // 리터럴 대입

		byte byte1 = 5; // 선언, 대입 동시
		char char1 = 'a';
		short short1 = -200; // 음수 저장
		int int2 = 10;

		int2 = byte1;
		int2 = short1;
		int2 = char1; // 대입 성공

		long long1 = 524L;
		float float1 = 1.19F;
		int int3 = 15;

		// int3 = long1;
		// int3 = float1; // 대입 실패

		int3 = (int) long1;
		int3 = (int) float1; // 형변환

		// 다중 대입
		int int4 = 25;
		int int5, int6, int7, int8, int9, int10;
		int4 = int5 = 25; // 오른쪽에서 왼쪽으로!!!
		// int4 = int5 = int6 = int7 = int8 = int9 = int10; // int10에 값이 없으므로 오류 /즉, 맨
		// 끝에는 값이 있어야함

		int int11 = 10, int12 = 200, int13;

		// +
		byte byte2;
		byte2 = 5;

		byte byte3;
		byte byte4 = 2;
		byte byte5 = 3;
		// byte3 = byte4 + byte5; // 산술 연산자(+)의 기본 타입은 int
		byte3 = (byte) (byte4 + byte5);
		// byte3 = (byte) byte4 + byte5; // 수식의 결과는 int이므로 오류 //타입 크기는 byte보다 int가 크므로
		// 암시적으로 확대 형변환이 일어남

		float float2 = 2.5F;
		double double2 = 20.0;
		byte byte7 = 2;
		byte byte8 = 3;
		// byte7 = float2 + byte8; //서로 다른 타입 간의 연산은 타입 크기가 큰 쪽으로 지정 //float > byte
		// byte7 = float2 + double2; // float < double
		byte8 = (byte) (float2 + byte8);
		byte7 = (byte) (float2 + double2);

		// /
		int int29;
		int29 = 5 / 2;
		System.out.printf("5/2=%d \n", int29);
		int29 = 5 / 3;
		System.out.printf("5/3=%d \n", int29);
		int29 = 5 / 4;
		System.out.printf("5/4=%d \n", int29);
		int29 = 5 / 5;
		System.out.printf("5/5=%d \n", int29);
		int29 = 5 / 6;
		System.out.printf("5/6=%d \n", int29);
		int29 = 5 / 7;
		System.out.printf("5/7=%d \n", int29);
		int29 = 5 / 8;
		System.out.printf("5/8=%d \n", int29);
		// 정수를 정수로 나누면 결과는 정수

		float float5;
		float5 = 15.0F / 4.0F;
		float5 = 15 / 4.0F;
		// float5 = 15.0/4.0F; //타입 불일치로 인한 오류: 컴파일 타입 오류, 문법적 오류
		float5 = (float) 15.0 / 4.0F;
		float5 = (float) (15.0 / 4.0F);
		float5 = 15 / 4;

		System.out.printf("15/4 = %f \n", float5);

		int int30 = 2;
		int int31 = 5;
		int int32 = 0; // 0으로 나누는 연산은 오류를 유발
		// int30 = int31 / int32; // 컴파일 시 오류는 안나고 실행하고 나서야 알 수 있는 오류: 런타임 오류, 논리적인 오류
		// 적절한 예외 처리가 필요

		// % - 나머지 연산
		int int33;
		// int33 = 15 % 0; // 0으로 나누는 연산은 오류를 유발

		int int34;
		int34 = 15 % 6;
		int34 = 0 % 7;

		// System.out.printf("0 % 7 = %d \n", int34);

		// - 단항 연산자
		byte byte13 = 10;
		byte byte14 = 5;
		// byte13 = -byte14; //int로 자동 변환돼서 오류 발생
		byte13 = (byte) -byte14;

		// 산술대입연산자 +=
		int int37 = 110;
		float float11 = 120.2F;
		byte byte16 = 5;
		String str2 = "Hello";
		boolean bool1 = true;
		int37 += 10;

		int37 += byte16; // int37 = int37 + byte16
		int37 -= 15; // int37 = int37 - 15
		int37 *= 2; // int37 = int37 * 2
		int37 /= 2; // int37 = int37 / 2
		// int37 /= 0; // int37 = int37 / 0
		float11 /= 0.0; // float11 = float11 / 0.0
		// int37 %= 3; // int37 = int37 % 3
		str2 += "How are you"; // str2 = str2 + "How are you"
		str2 += float11; // str2 = str2 + float11
		byte16 += float11; // byte16 = byte16 + float11
		str2 += byte16; // str2 = str2 + byte16

		// 증감 연산자: ++ --
		int int39 = 100;
		int int40 = 50;
		int40 = int39++ + 15;
		System.out.printf("100++ +15 = %d \n", int40); // 115

		int int41 = 100;
		int int42 = 50;
		int42 = ++int41 + 15;
		System.out.printf("++100 +15 = %d \n", int42); // 116

		// 문자열 연결 연산자 +
		String str3 = "Hello,";
		String str4 = "Alekhya";
		String str5 = str3 + str4;
		System.out.printf("str3 + str4 = %s \n", str5);
		System.out.printf("str3 + 123 = %s \n", str5 + 123);
		System.out.println(str3 + 123);
		System.out.println(str3 + Double.POSITIVE_INFINITY);
		System.out.println(str3 + 'A');

		// 비교 연산자 ==
		int int53 = 10;
		int int54, int55, int56;
		boolean bool5;
		int53 = int54 = int55 = 15;
		bool5 = (int53 == int54); // true
		System.out.printf("bool5 = %b \n", bool5);

		// bool5 = (int53 == int54 == int55);
		// 수식을 두 개로 나누어야 함
		// int53 == int54 , int54 == int55
		// 90 <= avg <= 100 (x)
		// avg >= 90, avg <=100

		bool5 = (int53 == (int54 + 1)); // false
		System.out.printf("bool5 = %b \n", bool5);

		// != :같지 않다
		bool5 = (int53 != int54); // true

		// &&
		int int71 = 10;
		int int72 = 15;
		boolean bool18 = (int71 > 5 && int72 > 10);
		System.out.printf("bool18 = %b \n", bool18); // true

		int int73 = 10;
		int int74 = 15;
		boolean bool19 = (int73 > 20 && int74 > 10);
		System.out.printf("bool18 = %b \n", bool19); // false
		// 단축평가 실행, 좌변식이 거짓 - 전체 거짓

		int int75 = 10;
		boolean bool20 = ((int75 = 50) > 5);
		System.out.printf("bool18 = %b \n", bool20); // true

		boolean bool21 = (int71 > 5 || int72 > 10);
		System.out.printf("bool18 = %b \n", bool18); // true

		boolean bool22 = (int73 > 20 || int74 > 10);
		System.out.printf("bool18 = %b \n", bool19); // true
		// 단축평가 실행, 좌변식이 참 - 전체 참

		// 삼항연산자 ?:
		// (수식) ? 참일때 값: 거짓일때 값
		int int89 = 50;
		int int90 = 25;
		int int91 = (int89 > int90) ? int89 : int90; // 수식이 참이므로 int89의 값이 int91에 들어감
		char char10 = (int89 < int90) ? 'F' : 'T'; // 수식이 거짓이므로 T

		double avg = 98.5;
		char grd = (avg >= 90) ? '수' : '우';
		grd = (avg >= 90) ? '수' : (avg >= 80) ? '우' : (avg >= 70) ? '미' : (avg >= 60) ? '양' : '가';

	}
}
