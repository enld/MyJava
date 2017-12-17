package Minji.sample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriters3 {

	public static void main(String[] args) throws IOException {
		// 단순한 파일 저장할 때!!

		// 객체를 저장할 파일 지정
		String fpath = "C:/Java/mydata2.txt";

		// FileWriter fw = new FileWriter(fpath);
		FileWriter fw = new FileWriter(fpath, true); // 파일이 추가되려면 append!!

		// fpath에 지정된 경로에 파일을 만들도록 객체 생성
		BufferedWriter bw = new BufferedWriter(fw);

		SungJukV5 sj = new SungJukV5("수지", 74, 65, 97);

		String line = sj.getName() + "/" + sj.getKor() + "/" + sj.getEng() + "/" + sj.getMat() + "\r\n";

		bw.write(line);

		bw.close();
		fw.close(); // 파일에 입력 내용이 완전히 저장하려면 필수!
	}

}
