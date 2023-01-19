package khie;

import java.io.FileReader;
import java.io.Reader;

public class FileIO_06 {

	public static void main(String[] args) {

		try {

			Reader reader = new FileReader(
					"C:\\Users\\KangChan\\git\\Khie_Java_Chapter_11_File_IO\\11_File_IO\\src\\khie\\FileIO_05.java");

			while (true) {

				int readByte = reader.read();

				if (readByte == -1) {
					break;
				}

				System.out.print((char) readByte);

			}
		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
