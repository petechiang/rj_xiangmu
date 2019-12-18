package com.jihe;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties sxj=new Properties();
		sxj.load(new FileInputStream("d:\\t.properties"));
		sxj.forEach((k,v)->System.out.println(k+":"+v));
		FileOutputStream out=new FileOutputStream("d:\\t.properties");
		sxj.setProperty("charset", "UTF-8");
		sxj.store(out, "新增charset编码");
	}

}