package com.citiustech.map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException{
		Properties p = new Properties();
		FileInputStream fil = new FileInputStream("/abc.properties");
		p.load(fil);
		System.out.println(p);
		p.setProperty("Mobile", "8239372");
		FileOutputStream fot = new FileOutputStream("/abc.properties");
		p.store(fot, "UPdated by yaseen");
	}
}
