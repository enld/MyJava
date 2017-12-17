package Minji.sample;

public class SungJukV3 {

	public static void main(String[] args) {

		// Student st1 = new Student();
		// Student st2 = new Student();
		// Student st3 = new Student();

		// st1.name = "혜교";
		// st1.kor = 99;
		// st1.eng = 99;
		// st1.mat = 99;

		// st1.total();
		// st1.average();
		// st1.grade();

		// System.out.printf("%s, %d, %d, %d, %d, %.1f, %s", st1.name, st1.kor, st1.eng,
		// st1.mat, st1.tot, st1.avg,
		// st1.grd);

	}

}

class Students { // 이름, 국어, 영어, 수학, 총점, 평균, 학점
	String stdName;
	int kor, eng, mat, tot;
	double avg;
	char grd;

	// 메서드 정의
	public void total() {
		tot = kor + eng + mat;

	}

	public void avg() {
		avg = tot / 3.0;

	}

	public void grd() {

		switch ((int) avg / 10) {
		case 10:
			grd = '수';
			break;
		case 9:
			grd = '우';
			break;
		case 8:
			grd = '미';
			break;
		case 7:
			grd = '양';
			break;
		default:
			grd = '가';
			break;
		}
	}
}
