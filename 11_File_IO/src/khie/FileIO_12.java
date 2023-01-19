package khie;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileIO_12 {

	public static void main(String[] args) {

		File temp = new File("C:/Windows/Temp");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");// 날짜를 일정한 형식을 맞춰주는 클래스

		/*
		 * listFiles() => 디렉토리에 포함된 파일 및 서브 디렉토리 목록 전부를 확인하여 File 객체 배열로 반환해 주는 메서드.
		 */

		File[] contents = temp.listFiles();

		System.out.println("날짜\t\t시간\t형태\t크기\t이름");
		System.out.println("------------------------------------------------");

		for (File file : contents) {

			System.out.print(sdf.format(new Date(file.lastModified()))); // lastModified() 마지막 수정 날짜
			// 및 시간을 반환해주는메서드

			if (file.isDirectory()) { // 폴더라면!

				System.out.print("\t<DIR>\t\t" + file.getName()); // getName() : 파일의 이름을 반환해 주는 메서드.

			} else { // 폴더가 아니라면 => 파일이라면!
				System.out.print("\t\t" + file.length() + "\t" + file.getName());
			}

			System.out.println();

		}

	}

}
