package Minji.sample;

//성적처리 프로그램 
//이름 국어 영어 수학 점수에 대한 총점 평균을 계산하고 출력 -> 데이터 6개

public class SungJukV1 {
	public static void main(String[] args) {
		// 변수 선언
		String name;
		int kor;
		int eng;
		int mat;
		int sum;
		double avg;

		// 성적처리
		// 변수 값 초기화
		name = "민지";
		kor = 99;
		eng = 99;
		mat = 71;

		// 총점, 평균 계산
		sum = kor + eng + mat;
		avg = sum / 3d; // 정수를 정수로 나누면 정수로 나옴 //.0을 붙이거나 d를 붙인다

		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(sum);
		System.out.println(avg);

	}

}
