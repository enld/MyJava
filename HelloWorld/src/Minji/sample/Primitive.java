package Minji.sample;

//자바 기본형 알아보기 

public class Primitive {
	public static void main(String[] arg) {
		int num1 = 123; // 정수형 변수 선언
		int num2 = 1111;
		byte num3 = 0b1111; // 2진수 (접두사 ob)
		long jumin = 1234561234567L; // int는 4바이트 그러니까 long으로 수정해야함 (long을 의미하는 접미사)

		int result = num1 + num2;
		System.out.println(result); // Ctrl + F11 은 실행

		result = num1 - num2;
		System.out.println(result);

		result = num1 * num2;
		System.out.println(result);

		result = num1 / num2;
		System.out.println(result);

		result = num1 % num2;
		System.out.println(result);

	}

}
