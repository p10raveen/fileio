package com.characterstream;

import java.io.*;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException{
		FileReader fr1 = new FileReader("C:\\project\\fileIOproject\\src\\directory\\file5.txt");
		FileReader fr2 = new FileReader("C:\\project\\fileIOproject\\src\\directory\\file6.txt");
		PrintWriter pw = new PrintWriter("C:\\project\\fileIOproject\\src\\directory\\file7.txt");
		
		BufferedReader br = new BufferedReader(fr1);
		String line = br.readLine();
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		
		br = new BufferedReader(fr2);
		line = br.readLine();
		while(line != null)
		{
			pw.println(line);
			line = br.readLine();
		}
		
		pw.close();
		br.close();
		fr1.close();
		fr2.close();
		
		
	}

}
