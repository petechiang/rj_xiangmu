package com.api;

public class E53 {

	public static void main(String[] args) {
		String s1="abc1a3b6cc3b7a8n4b1a5.jpg";
		if (s1.startsWith("a")) {
			System.out.println("字符串s1以a开头");
		}
		if (s1.endsWith("jpg")) {
			System.out.println("字符串s1以jpg结尾");
		}
		if (s1.contains("cba")) {
			System.out.println("字符串s1包含cba这个子串");
		}
		if (!s1.isEmpty()) {
			System.out.println("字符串s1不是空的");
		}
		System.out.println("字符串s1的每个字符是:");
		//将字符串打碎成字符数组
		char[] zfsz=s1.toCharArray();
		for (int i = 0; i < zfsz.length; i++) {
			char c = zfsz[i];
			if (i==s1.length()-1) {
				System.out.print(c);
			}else
				System.out.print(c+",");
		}
		System.out.println();
		

	}

}
