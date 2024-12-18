package com.practice.java._21javaio;

import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class _2JavaBufferWriterAndReader {

	/*
	 * Java BufferedWriter class is used to provide buffering for Writer instances.
	 * It makes the performance fast. It inherits Writer class. The buffering
	 * characters are used for providing the efficient writing of single arrays,
	 * characters, and strings. Java BufferedWriter extends Writer.
	 * 
	 * Java BufferedReader class is used to read the text from a character-based
	 * input stream. It can be used to read data line by line by readLine() method.
	 * It makes the performance fast. Java BufferedReader extends Reader.
	 */

	public static void main(String[] args) {

		try {

			Files.deleteIfExists(Paths.get("JavaBufferWriterAndReaderFile.txt"));

			System.out.println("Deletion existing file with same name successful.");

			FileWriter writer = new FileWriter("JavaBufferWriterAndReaderFile.txt", true);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);

			bufferedWriter.write("Hi All");
			bufferedWriter.newLine();
			bufferedWriter.write("First Text File");

			bufferedWriter.close();

			FileReader reader = new FileReader("JavaBufferWriterAndReaderFile.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (NoSuchFileException e) {
			System.out.println("No such file/directory exists");
		} catch (DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
