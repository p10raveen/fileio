package com.characterstream;

import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("C:\\project\\fileIOproject\\src\\directory\\file4.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Hello");
		bw.newLine();
		bw.write("and");
		bw.newLine();
		bw.write("welcome");
		
		bw.close();
		fw.close();

	}

}
