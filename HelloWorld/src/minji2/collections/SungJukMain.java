package minji2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 프로그램이 종료되면 데이터가 삭제됨
public class SungJukMain {

	private static StringBuilder displayMenu = null;
	private static List<SungJukVO> sjlist;

	static {
		sjlist = new ArrayList<>();

		displayMenu = new StringBuilder();
		displayMenu.append("-= 성적 처리 프로그램 =- \n").append("---------------------\n").append("1: 새로운 성적데이터 추가 \n")
				.append("2: 성적데이터 전체 출력\n").append("3: 성적데이터 상세 조회\n").append("4: 성적데이터 삭제\n").append("5: 성적데이터 삭제\n")
				.append("0: 프로그램 종료\n").append("---------------------\n").append(">> 실행할 작업을 선택하세요: \n");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print(displayMenu);
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				addSungJuk();
				break;
			case "2":
				getSungJuk();
				break;
			case "3":
				getSungJuk();
				break;
			case "4":
				modifySungJuk();
				break;
			case "5":
				removeSungJuk();
				break;
			case "0":
				exitProgram();
				break;

			}
			sc = new Scanner(System.in);
		}

	}

	private static void exitProgram() {
		// TODO 자동 생성된 메소드 스텁
		System.exit(0);
	}

	private static void removeSungJuk() {
		// TODO 자동 생성된 메소드 스텁

	}

	private static void modifySungJuk() {
		// TODO 자동 생성된 메소드 스텁

	}

	private static void getSungJuk() {
		System.out.println("전체 성적 데이터 조회");
		System.out.println("--------------");

		System.out.println((sjlist.get(0)).toString());

	}

	private static void addSungJuk() {
		// TODO 자동 생성된 메소드 스텁
		Scanner sc = new Scanner(System.in);
		System.out.println("새로운 성적 데이터 추가");
		System.out.println("---------------");
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("국어을 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어을 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학을 입력하세요");
		int mat = sc.nextInt();

		// sc.close();

		SungJukVO sj = new SungJukVO(name, kor, eng, mat); // 변수 sj 안에 이름, 국어, 영어, 수학 다 집어넣음
		processSugJuk(sj); // 총점, 학점, 평균 계산

		sjlist.add(sj); // 컬렉션에 성적 추가

	}

	private static void processSugJuk(SungJukVO sj) {
		// TODO 자동 생성된 메소드 스텁
		int tot = sj.getKor() + sj.getEng() + sj.getMat();
		double avrg = (double) tot / 3;
		char grd = '가';

		switch ((int) avrg / 10) {
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

		}
		sj.setTot(tot);
		sj.setAvrg(avrg);
		sj.setGrd(grd);

	}

}
