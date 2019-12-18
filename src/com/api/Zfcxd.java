package com.api;

public class Zfcxd {

	public static void main(String[] args) {
		String s1="java";
		String s2="java";
		//==判断地址是否相等  equals判断内容是否相等
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3=new String("java");
		String s4=new String("java");
		StringBuffer s5=new StringBuffer("java");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//System.out.println(s3==s5);

	}

}
