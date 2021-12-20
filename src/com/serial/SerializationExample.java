package com.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable
{
	int a = 50;
	int b = 100;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		// Serialization
		SerializationExample se = new SerializationExample();
		FileOutputStream fos = new FileOutputStream("C:\\project\\fileIOproject\\src\\directory\\file8.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(se);
		
		// Deserialization
		FileInputStream fis = new FileInputStream("C:\\project\\fileIOproject\\src\\directory\\file8.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializationExample se2 =(SerializationExample) ois.readObject();
		System.out.println(se2.a+" "+se2.b);
		
	}

}
