package Minji.sample;

public class SungJukV4 {
	// 외부에서 입력해야 하는 데이터 -> 생성자 매개변수의 대상이 됨
	String name;
	int kor, eng, mat;

	private int tot;
	private double avg;
	private char grd;

	public SungJukV4() {
		this("혜교", 99, 98, 99); // 매개변수가 타입이 일치하는 아래의 메소드 호출 // 언제나 맨 첫줄에!
		// name = "혜교";
		// kor = 99;
		// eng = 98;
		// mat = 99;
	}

	public SungJukV4(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	/*
	 * // ctrl + space public SungJukV4() { // TODO 자동 생성된 생성자 스텁 }
	 * 
	 * // 소스 -> 필드를 사용하여 생성자 생성 public SungJukV4(String name, int kor, int eng, int
	 * mat) { super(); this.name = name; this.kor = kor; this.eng = eng; this.mat =
	 * mat; }
	 */

}
