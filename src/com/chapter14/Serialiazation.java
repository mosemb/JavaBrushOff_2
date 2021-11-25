package com.chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialiazation implements Serializable {

	private int width;
	private int height;

	public void setWidth(int width) {

		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static void main(String[] args) throws IOException {
		
		Serialiazation selSerialiazation  = new Serialiazation();
		selSerialiazation.setHeight(20);
		selSerialiazation.setWidth(30);
		
		// Saving an object
		FileOutputStream fileOutputStream = new FileOutputStream("foo.ser");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		objectOutputStream.writeObject(selSerialiazation);
		objectOutputStream.close();
		

	}

}
