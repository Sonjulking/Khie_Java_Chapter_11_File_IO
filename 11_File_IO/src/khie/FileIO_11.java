package khie;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileIO_11 {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("C:/test/sample/sample.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("======================================");
		bw.newLine(); // 다음 줄로 이동 시키는 메서드

		bw.write("KH정보교육원 종로지점 - D 강의실");
		bw.newLine();
		bw.write("여러분 모두 취업 합시다. 화이팅");
		bw.newLine(); // 다음 줄로 이동 시키는 메서드
		bw.write("======================================");
		bw.flush(); // 메소드는 버퍼에 데이터가 가득 차 있건 아니건,버퍼에서 강제로 밀어내도록 하는 메소드이다.
		// 입출력 객체를 닫아 주자.
		bw.close();
		fw.close();

		System.out.println("파일에 저장 완료 ^^");

	}

}
