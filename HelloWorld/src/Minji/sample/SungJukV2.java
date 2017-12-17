package Minji.sample;

import java.util.Scanner;

public class SungJukV2 {
	public static void main(String[] args) {
		/*
		 * Scanner 클래스를 이용해서 이름, 국어, 영어, 수학을 입력받아서 총점, 평균, 학점 계산 후 출력
		 */

		// 변수 선언
		String name;
		int kor, eng, mat, sum;
		double avg;
		char grd;

		// 성적 입력 받음
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요:"); // 출력 먼저
		name = sc.nextLine(); // 입력 받기
		System.out.print("당신의 국어 성적을 입력하세요:");
		kor = sc.nextInt();
		System.out.print("당신의 영어 성적을 입력하세요:");
		eng = sc.nextInt(); // Integer.parseInt(sc.nextLine())라고 써도 됨
		System.out.print("당신의 수학 성적을 입력하세요:");
		mat = sc.nextInt();
		sc.close();

		sum = kor + eng + mat;
		avg = sum / 3.0; // 형변환 (double)sum/3해도 됨

		switch ((int) avg / 10) {
		case 10:
		case 9:
			grd = '수';
			break;
		case 8:
			grd = '우';
			break;
		case 7:
			grd = '미';
			break;
		case 6:
			grd = '양';
			break;
		default:
			grd = '가';
			break;
		}

		// 결과 출력
		// System.out.printf("당신의 이름을 입력하세요: %s\n", name);
		// System.out.printf("당신의 국어 성적을 입력하세요: %d\n", kor);
		// System.out.printf("당신의 영어 성적을 입력하세요: %d\n", eng);
		// System.out.printf("당신의 수학 성적을 입력하세요: %d\n", mat);

		System.out.printf("이름\t국어\t영어\t수학\n");
		System.out.printf("%s\t%d\t%d\t%d", name, kor, eng, mat);
		System.out.printf("총점은 %d입니다 \n", sum);
		System.out.printf("평균은 %f입니다 \n", avg);

	}
}
