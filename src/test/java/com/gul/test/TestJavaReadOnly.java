package com.gul.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestJavaReadOnly {

	public static void main(String[] args) throws IOException {
		File file = new File("file1.txt");
		FileWriter fileWriter = new FileWriter("test.pdf");
		fileWriter.write("Hello World");
		fileWriter.close();
		if (!file.exists()) {
			file.createNewFile();
//			writer.write("My name is Gulrez Farooqui");
		}
		if (file.setReadOnly()) {
			System.out.println("file is set to read only");
		} else {
			System.out.println("Unable to set file read only");
		}

	}
}
