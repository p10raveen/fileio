package com.bytestream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BOSExample1 {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\project\\fileIOproject\\src\\directory\\file2.txt");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			String s = "hello and welcome";
			byte[] b = s.getBytes();
			bos.write(b);// hello and welcome
			
			bos.close();
			fos.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
