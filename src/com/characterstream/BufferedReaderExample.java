package com.characterstream;

import java.io.*;


public class BufferedReaderExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\project\\fileIOproject\\src\\directory\\file4.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		
		while( s != null)
		{
			System.out.println(s);
			s = br.readLine();
		}
		
		br.close();
		fr.close();
	}

}
