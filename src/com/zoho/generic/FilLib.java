package com.zoho.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FilLib {
	public String getpropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/data.propertydata");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}

}
