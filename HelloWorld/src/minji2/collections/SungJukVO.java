package minji2.collections;

public class SungJukVO {
	// 학생성적정보 저장용 클래스
	// 멤버변수, 매개변수 생성자, setter/getter/toString까지 정의
	protected String name;
	protected int kor;
	protected int eng;
	protected int mat;

	@Override
	public String toString() {
		return "SungJukVO [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", avrg="
				+ avrg + ", grd=" + grd + "]";
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public double getAvrg() {
		return avrg;
	}

	public void setAvrg(double avrg) {
		this.avrg = avrg;
	}

	public char getGrd() {
		return grd;
	}

	public void setGrd(char grd) {
		this.grd = grd;
	}

	protected int tot;
	protected double avrg;
	protected char grd;

	public void SunJukVO() {

	}

	public SungJukVO(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

}
