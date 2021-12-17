package com.characterstream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f = new File("C:\\\\project\\\\fileIOproject\\\\src\\\\directory\\\\file3.txt");
		FileReader fr = new FileReader(f);
		
		char[] ch = new char[(int)f.length()];
		fr.read(ch);
		for(char a: ch)
		{
			System.out.println(a);
		}
		
		fr.close();
	}

}
