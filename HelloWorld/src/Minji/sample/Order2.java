package Minji.sample;

public class Order2 {

	// 변수 선언
	String userId;
	String prodName;
	int qty;
	String oderDate;
	String oderDest;
	String oderPrice;

	// 기본 생성자
	public Order2() {
		this("minji", "dress", 2, "2017.12.03", "50", "40000");
	}

	// 생성자
	public Order2(String userId, String prodName, int qty, String oderDate, String oderDest, String oderPrice) {
		super();
		this.userId = userId;
		this.prodName = prodName;
		this.qty = qty;
		this.oderDate = oderDate;
		this.oderDest = oderDest;
		this.oderPrice = oderPrice;
	}

	// setter/getter
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getOderDate() {
		return oderDate;
	}

	public void setOderDate(String oderDate) {
		this.oderDate = oderDate;
	}

	public String getOderDest() {
		return oderDest;
	}

	public void setOderDest(String oderDest) {
		this.oderDest = oderDest;
	}

	public String getOderPrice() {
		return oderPrice;
	}

	public void setOderPrice(String oderPrice) {
		this.oderPrice = oderPrice;
	}

}
