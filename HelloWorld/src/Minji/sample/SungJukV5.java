package Minji.sample;

public class SungJukV5 {

	// 멤버 변수 - private으로 선언한다..
	private String name;
	private int kor, eng, mat;

	// 기본 생성자
	public SungJukV5() {
		this("", 0, 0, 0);

	}

	public SungJukV5(String name, int kor, int eng, int mat) {

		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// stter/getter
	// stter : public void setXxx(매개변수) //하나씩 초기화!!!
	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	// getter : public 반환타입 getXXx()
	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

}
