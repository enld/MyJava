package Minji.sample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {
	public static void main(String[] args) {

		// 배열의 단점
		// 같은 종류의 데이터만 다룸, 크기 조정 X
		// 문자 타입으로 선언했으면 문자 타입의 데이터만!! (숫자 X)
		String[] userid = new String[3];
		userid[0] = "zzyzyz";
		// userid[1] = 123456;
		// userid[2] = 987654.321;
		// userid[3] = "abc123";

		// List 인터페이스의 ArrayList
		// 배열과 달리 크기를 지정하지 않아도 되고 어떠한 종류의 데이터도 add 가능(저장 가능)
		ArrayList list = new ArrayList();
		list.add("zzyzzy");
		list.add(123456);
		list.add(987.654);
		list.add(new SungJukV4()); // 클래스도 넣을 수 있음

		// 문제는 꺼내올 때 발생
		// add 시 모든 데이터는 Object 형으로 저장
		// 따라서, 꺼낼 때 각 데이터 유형에 맞게 암시적으로 형변환이 발생 (불필요한 형변환 -> 시스템 성능이 떨어짐 -> 제약: 지네릭스)
		System.out.println((String) list.get(0));
		System.out.println((int) list.get(1));
		System.out.println((double) list.get(2));
		System.out.println((SungJukV4) list.get(3));

		// 지네릭스
		// 컬렉션 객체에 저장할 객체의 종류를 미리 지정
		// 따라서, 불필요한 형변환을 막음
		// 즉, 한 종류의 객체만을 저장한다는 지침을 지키자!
		// 저장할 객체의 종류는 <> 기호 사용

		List<String> list2 = new ArrayList<String>();
		list2.add("zzyzzy");
		// list2.add(123456);
		// list2.add(987.654);
		// list2.add(new SungJukV4());
		// list2는 String만!

		// 지네릭 예제 - JDK5 이전
		List zoo1 = new ArrayList();
		Rabbit r1 = new Rabbit();
		DesertFox f1 = new DesertFox();
		Zibra z1 = new Zibra();

		zoo1.add(r1);
		zoo1.add(f1);
		zoo1.add(z1);

		// 암시적 형변환
		System.out.println(zoo1.get(0));
		System.out.println(zoo1.get(1));
		System.out.println(zoo1.get(2));

		// r1 = zoo1.get(0); // Object -> Rabbit 필요
		r1 = (Rabbit) zoo1.get(0);
		f1 = (DesertFox) zoo1.get(1);
		z1 = (Zibra) zoo1.get(2);

		// JDK5 이상 - 지네릭스 사용 // 배열 보다 나은점? 동적 배열.. 메서드 넣을 수 있고.. //뒷 부분의 <>은 그냥 <>써도 됨
		// 데이터를 넣을 때는 add 빼낼 때는 get
		List<Rabbit> zoo2 = new ArrayList<>();
		List<DesertFox> zoo3 = new ArrayList<>();
		List<Zibra> zoo4 = new ArrayList<Zibra>();

		zoo2.add(r1);
		r1 = zoo2.get(0); // 꺼낼 때 형변환이 없다!

		zoo3.add(f1);
		f1 = zoo3.get(0);

		zoo4.add(z1);
		z1 = zoo4.get(0);

		// List CRUD 예제
		List<String> namelist = new ArrayList<>();
		namelist.add("수지");
		namelist.add("혜교");
		namelist.add("지현");

		// 데이터 갯수 (크기): size() //cf) 배열은 length!!
		System.out.println(namelist.size());

		// 데이터 조회 : get(위치값)
		System.out.println(namelist.get(0));
		System.out.println(namelist.get(1));
		System.out.println(namelist.get(2));

		// 데이터 전체조회: for
		for (int i = 0; i < namelist.size(); i++) {
			System.out.println(namelist.get(i));

		}

		// 향상된 for문 - for(형 val: 컬렉션 변수) // 컬렉션 변수에서 값을 가져와서 변수 val에 넣음! // 컬렉션을 다룰 때는
		// 향상된 for문 추천!!
		for (String val : namelist) {
			System.out.println(val);
		}

		// 데이터 전체조회: Iterator
		// Iterator: 반복처리자
		// 컬렉션에 저장된 데이터에 접근해서 반복적으로 무언가를 처리하기 위한 것
		Iterator<String> ir = namelist.iterator();
		while (ir.hasNext()) { // 가져올 데이터가 있는지
			System.out.println(ir.next());
		}

		// 수정: set(위치, 값)
		System.out.println(namelist.get(0)); // 바뀌기 전
		namelist.set(0, "중기");
		System.out.println(namelist.get(0)); // 바뀐 후

		// 찾기: contains()

		String key = "중기";
		for (int j = 0; j < namelist.size(); j++) {
			if (namelist.get(j).contains(key))
				System.out.println((j + 1) + "번째에서 데이터 찾음");
		}

		// 다른 방법
		String key2 = "혜교";
		for (int j = 1; j <= namelist.size(); j++) {
			if (namelist.get(j - 1).contains(key2))
				System.out.println((j + 1) + "번째에서 데이터 찾음");
		}

		// 삭제: remove(위치), clear
		System.out.println(namelist.get(0));
		namelist.remove(0);
		System.out.println(namelist.get(0));

		namelist.clear(); // 모두 삭제
		// System.out.println(namelist.get(0));

	}

}

class Rabbit {

}

class DesertFox {

}

class Zibra {

}
