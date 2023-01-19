package khie;

import java.io.InputStream;

public class FileIO_02 {

	public static void main(String[] args) {

		System.out.println("한 문자를 입력하세요 .... ");

		try {
			// System.in : 표준 입력장치 (키보드)
			InputStream is = System.in;
			int num = is.read(); // read() : 표준입력장치를 통해서 입력받은 데이터를 읽게 된다.
			// 읽으면 ASCII 코드상의 숫자로 변환이 된다.

			System.out.println("읽어온 데이터(ASCII) >>> " + num);
			System.out.println("읽어온 데이터(문자) >>> " + (char) num);

		} catch (Exception e) {
			// TODO 자동 생성된 catch 블록
			e.printStackTrace();
		}
	}

}
