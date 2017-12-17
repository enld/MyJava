package Minji.sample;

// p367 다형성
public class Polymorph {

	public static void main(String[] args) {

		// 객체 생성
		Tv tv = new Tv();
		System.out.println(tv.getPrice());
		System.out.println(tv.getBonus());

		Computer com = new Computer();
		System.out.println(com.getPrice());
		System.out.println(com.getBonus());

		Radio r = new Radio();
		System.out.println(r.getPrice());
		System.out.println(r.getBonus());

		Buyer b = new Buyer();

		// 메서드 3개로
		b.buy(tv);
		b.buy(com);
		b.buy(r);
		System.out.println(b.getMoney());
		System.out.println(b.getBonusTotal());

		// 메서드 하나로 (형변환으로)
		b.buy2(tv);
		b.buy2(com);
		b.buy2(r);
		System.out.println(b.getMoney());
		System.out.println(b.getBonusTotal());

	}

}

class Item {
	private int price;
	private int bonus;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

}

class Tv extends Item {
	// 생성자
	public Tv() {
		setPrice(1500);
		setBonus(150);
	}
}

class Computer extends Item {
	public Computer() {
		setPrice(3500);
		setBonus(300);
	}
}

class Radio extends Item {
	public Radio() {
		setPrice(500);
		setBonus(50);
	}
}

class Buyer {
	private int money; // 총구입 금액
	private int bonusTotal; // 총적립 금액

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getBonusTotal() {
		return bonusTotal;
	}

	public void setBonusTotal(int bonusTotal) {
		this.bonusTotal = bonusTotal;
	}

	// 상품 구매 기능
	public void buy(Tv tv) { // tv를 구매했을 때 //여기서 TV는 클래스 tv는 매개변수
		money = tv.getPrice();
		bonusTotal = tv.getBonus();
	}

	public void buy(Computer com) {
		money += com.getPrice();
		bonusTotal += com.getBonus();
	}

	public void buy(Radio r) {
		money += r.getPrice();
		money += r.getBonus();
	}

	// 위 코드를 줄이자! -> 다형성 -> 형 변환을 지원 (자동으로 업캐스팅!!)
	// 자식클래스 객체를 부모클래스 타입으로 변환이 가능 -> 부모클래스를 쓰자!
	// Tv, Computer, Radio -> Item
	public void buy2(Item i) {
		money += i.getPrice();
		bonusTotal += i.getBonus();
	}

}