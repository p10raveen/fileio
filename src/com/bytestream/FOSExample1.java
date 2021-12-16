package com.bytestream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FOSExample1 {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\project\\fileIOproject\\src\\directory\\file1.txt");
			fos.write(70); // F
			
			String s = "hello and welcome";
			byte[] b = s.getBytes();
			fos.write(b);// hello and welcome
			
			fos.write(b,2,6); // llo an
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
