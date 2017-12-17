package Minji.sample;

public class DataType {
	public static void main(String[] args) {
		// 기본 자료형 Primitive
		// 정수 : int
		int int1 = 21;
		int int2 = 021; // 8진수를 의미하는 접두사 0 -> 17이 출력됨
		int int3 = 0;
		int int4 = 00; // 8진수
		int int5 = 0x123; // 16진수를 의미하는 접두사 x
		int int6 = 0x10;
		int int7 = 0xA;

		int int11 = 0b10101; // 2진수를 의미하는 접두사 b(binary) 1+0+4+0+16 p47
		int int12 = 0b00011;
		int int13 = 0b10;
		int int14 = 0b000000010; // 자리수 다 채워도 똑같은 결과가 나옴

		int int15 = Integer.MAX_VALUE; // 상수 - 변하면 안되는 값을 선언할 때 //int의 최댓값
		int int16 = Integer.MIN_VALUE; // int의 최솟값

		int a; // 변수 - 값 바꿀 수 있음
		final int b; // 상수 - 값 고정
		a = 1;
		a = 2;
		a = 3;

		b = 1; // 앞에서 상수로 선언됨. 상수이므로 값 바꾸면 안됨
		// b = 2;

		// long - 정수보다 더 많은 수를 저장
		long long1 = 0L; // long으로 저장하려면 접미사L
		long long2 = 401L;
		long long3 = -3556L;
		long long4 = 89898L;
		long long5 = -105L;
		long long6 = 25L;
		long long7 = 031L;
		long long8 = 0x19L;
		long long9 = 0b11001L;
		// long long10 = 123456789101112131415L; //범위 초과

		int int17 = 10;
		long long11 = 20;
		long11 = int17; // long(64bit)변수에 int(32bit)값 저장
						// 자동 형변환 - 확대 변환

		int int18 = 10; //
		long long12 = 2148483655L;
		// int18 = long12; //int(32bit)변수에 long(64bit)값 저장
		// 축소 변환 - 불가 (데이터 손실)

		int int19 = 5;
		long long13 = 25L; // 작은 숫자라도
		// int19 = long13; //축소 변환 불가

		int18 = (int) long12; // 명시적 형변환 (자동이 아니라 강제로)
								// (변환 타입) : cast 연산자
		int19 = (int) long13;

		long longmax = Long.MAX_VALUE;
		long longmin = Long.MIN_VALUE;

		// byte
		byte bytemax = Byte.MAX_VALUE;
		byte bytemin = Byte.MIN_VALUE;

		// short
		short shortmax = Short.MAX_VALUE;
		short shortmin = Short.MIN_VALUE;

		// char - 문자 하나 저장할 때, ''를 사용
		char char1 = 'A';
		char char2 = 'a';
		char char3 = '5';
		char char4 = '수';
		char char5 = '?';

		// escape sequence
		// 문자 리터럴(literal)로 처리하지 않고 문자 그대로 처리하고 싶을 때 사용 (특수 기호들 사용할 때)
		char char6 = '/';
		// cahr char7 = '\' 오류
		char char7 = '\\'; // \를 표기
		char char8 = '\n'; // 줄바꿈
		char char9 = '\r'; // 라인피드
		char char10 = '\b'; // beep
		char char11 = '\t'; // 탭문자
		char char12 = '\''; // 작은 따옴표 '
		char char13 = '\"'; // 큰 따옴표 "

		// uincode
		// 다국어를 표기하기 위한 문자 집합
		char char14 = '\u0041';
		char char15 = '\uAC00';

		// byte and char
		byte byte7 = 10;
		short short16 = 15;
		int int23 = 150;
		long long16 = 20L;
		char char18 = 'A';

		// byte7 = char18; 형변환 오류
		byte7 = (byte) char18;
		// char18 = byte7; 형변환 오류
		char18 = (char) byte7;

		int23 = char18; // 자동 변환 (int-32bit char-16bit)
		int23 = (int) char18; // 명시적 형변환

		char charmax = Character.MAX_VALUE;
		char charmin = Character.MIN_VALUE;
		System.out.println("char 최대 = " + charmax); // 출력 안됨
		System.out.println("char 최소 = " + charmin);
		System.out.println("char 최대 = " + (int) charmax); // 문자를 숫자로
		System.out.println("char 최소 = " + (int) charmin);

		char char19 = 'A';
		int int24 = 65;
		System.out.println("A의 int는?" + (int) char19);
		System.out.println("65의 char는?" + (char) int24);

		// 아스키코드 0 - 9: 45 - 57
		// 아스키코드 a - z: 97 - 122
		// 아스키코드 A - Z: 65 - 90

		// boolean - 논리값 저장 (true, false)
		boolean bool1 = true;
		boolean bool2 = false;
		// boolean bool3 = 123;
		// boolean bool4 = 'a';
		// C언어에서는 0이나 1도 넣을 수 있음
		System.out.println("bool1 = " + bool1);
		System.out.println("bool2 = " + bool2);

		// float (정밀도 주의!!!!)
		// float float1 = 296 / 3.0f;
		// System.out.println("float1 = " + float1); // 98.666664

		// double (정밀도 주의)
		// double double1 = 296 / 3.0;
		// System.out.println("double1 = " + double1); // 98.666666666666667

		// float 형 리터럴 선언시 접미사 f, F(추천)
		float float1 = 296 / 3.0f;
		float float2 = 8F;
		float float3 = 8.F;
		float float4 = 8.0F;
		float float5 = 3.14F;
		float floatmax = Float.MAX_VALUE;
		float floatmin = Float.MIN_VALUE;
		float floatInf = Float.POSITIVE_INFINITY;
		float floatNaN = Float.NaN; // is not a number
		System.out.println(float2);
		System.out.println(float3);
		System.out.println(float4);
		System.out.println(float5);
		System.out.println(floatmax);
		System.out.println(floatmin);
		System.out.println(floatInf);
		System.out.println(floatNaN);

		// double 형 리터럴 선언시 접미사 d, D(추천)
		double double1 = 296 / 3.0f;
		double double2 = 8.;
		double double3 = 8.0;
		double double4 = 8.D;
		double double5 = 78.9867;
		double doublemax = Double.MAX_VALUE;
		double doublemin = Double.MIN_VALUE;
		double doubleInf = Double.POSITIVE_INFINITY;
		double doubleNaN = Double.NaN; // is not a number

		// underscore
		// 숫자 표기시 자릿수를 나타내기 위해 사용
		// JDK 7 이상부터 지원하기 시작
		int x1 = 1_234;
		int x2 = 1__234;
		// int y1 = __1234; 오류
		// int y2 = 1234_; 오류

		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);

		// 출력
		System.out.println("int1 = " + int1);
		System.out.println("int2 = " + int2);
		System.out.println("int3 = " + int3);
		System.out.println("int4 = " + int4);
		System.out.println("int5 = " + int5);
		System.out.println("int6 = " + int6);
		System.out.println("int7 = " + int7);
		System.out.println("int11 = " + int11);
		System.out.println("int12 = " + int12);
		System.out.println("int13 = " + int13);
		System.out.println("정수 최대 = " + int15);
		System.out.println("정수 최소 = " + int16);
		// System.out.println("long1 = " + long1);
		System.out.println("int18= " + int18);
		System.out.println("int19= " + int19);

		System.out.println("long 최대 = " + longmax);
		System.out.println("long 최소 = " + longmin);
		System.out.println("short 최대 = " + shortmax);
		System.out.println("short 최소 = " + shortmin);

		System.out.println("char1 = " + char1);
		System.out.println("char2 = " + char2);
		System.out.println("char3 = " + char3);
		System.out.println("char4 = " + char4);
		System.out.println("char5 = " + char5);

		System.out.println("줄바꿈\n\n\n\n\n");
		System.out.println("탭\t탭\t탭\t탭\t탭\t탭");

		System.out.println("char14 = " + char14);
		System.out.println("char15 = " + char15);

		System.out.println('A' + 6.5);
		System.out.printf("296/3의 float = %f \n", float1); // 서식문자열 지원하는 printf (%+대상 , 자료형)
		System.out.printf("296/3의 float = %10f \n", float1);
		System.out.printf("296/3의 float = %.2f \n", float1);

	}

}
