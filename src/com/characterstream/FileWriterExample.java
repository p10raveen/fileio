package com.characterstream;
import java.io.*;
public class FileWriterExample {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileWriter fw =new FileWriter("C:\\project\\fileIOproject\\src\\directory\\file3.txt");
		
		fw.write("Hello");
		fw.write('A');
		fw.write(new char[]{'a','b','c'});
		
		fw.close();
	}

}
