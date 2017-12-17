package Minji.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters2 {

	public static void main(String[] args) throws IOException {
		// 객체를 파일에 써보자! - Stream!!
		// 클래스에 대한 객체를 만들고 그것을 파일에 저장

		// 객체를 저장할 파일 지정
		String fpath = "C:/Java/mydata.txt";

		// FileWriter fw = new FileWriter(fpath);
		FileWriter fw = new FileWriter(fpath, true); // 파일이 추가되려면 append!!

		// fpath에 지정된 경로에 파일을 만들도록 객체 생성
		BufferedWriter bw = new BufferedWriter(fw);

		SungJukV5 sj = new SungJukV5("수지", 74, 65, 97);
		System.out.println(sj.getName());

		// bw.write(sj);
		// 클래스의 객체는 바이트스트림으로 파일에 써야 함

		// 버퍼기능이 지원되는 파일쓰기 클래스 사용

		bw.close();
		fw.close(); // 파일에 입력 내용이 완전히 저장하려면 필수!
	}

}
