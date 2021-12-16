package com.bytestream;

import java.io.FileInputStream;
import java.io.IOException;

public class FISExample1 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\\\project\\\\fileIOproject\\\\src\\\\directory\\\\file1.txt");
		int a = fis.read();
		System.out.println(a); //70
		System.out.println((char)a);//F
		
		while(a != -1)
		{
			System.out.print((char)a); // Fhello and welcomello an
			a = fis.read();
		}
		
		fis.close();
	}

}
