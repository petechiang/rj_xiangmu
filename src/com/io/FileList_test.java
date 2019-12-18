package com.io;

import java.io.File;
import java.io.FileDescriptor;
import java.util.Arrays;

public class FileList_test {
	static long max=0;
	public static void main(String[] args) {
		File ml=new File("d:\\18软件2班作业");
		fileDir(ml);
		

	}

	private static void fileDir(File ml) {
		File[]  wjsz=ml.listFiles();
		
		//foreach
		for (File file : wjsz) {
			if(file.isDirectory()) {
				//System.out.println(file.getName()+"的长度是"+file.length());
				if(file.getName().contains("闻康")) {
					System.out.println(file.getAbsolutePath());
				}
				
				fileDir(file);
			//String[] zml=ml.list((dir,name)->name.endsWith(".java"));
			//Arrays.stream(zml).forEach(f->System.out.println(f));
			}else if(file.isFile()) {
				/*if(file.getName().endsWith(".txt")||file.getName().endsWith(".zip"))
					file.delete();*/
				/*if (file.length()>max) {
					max=file.length();
					System.out.println(file.getAbsolutePath()+"的长度是"+file.length());*/
				}
			}
		}
		
		
	}


