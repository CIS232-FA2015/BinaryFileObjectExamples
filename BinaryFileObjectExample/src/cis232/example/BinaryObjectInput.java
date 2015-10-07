package cis232.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BinaryObjectInput {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("rectangles.dat"));
		Rectangle r = (Rectangle)ois.readObject();
		System.out.printf("%d %d", r.length, r.width);
	}

}
