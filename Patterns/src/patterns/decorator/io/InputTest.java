package patterns.decorator.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public class InputTest {

	public static void main(String[] args) throws IOException {
		int c;
		File file = new File("testIO.txt");
		System.out.println(file.getAbsolutePath());
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file.getAbsolutePath())));
			while((c = in.read()) > 0) {
				System.out.println((char)c);
			}
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
