package com.characterstream;

import java.io.*;

public class FileReaderExample {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\\\project\\\\fileIOproject\\\\src\\\\directory\\\\file3.txt");
		int a = fr.read();
		System.out.println((char)a);
		
		while(a != -1)
		{
			System.out.println((char)a);
			a = fr.read();
		}
		fr.close();
	}
}
