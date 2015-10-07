package cis232.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BinaryObjectOutput {

	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("rectangles.dat"));
		Rectangle r = new Rectangle(2,3);
		oos.writeObject(r);
		oos.close();
	}

}
