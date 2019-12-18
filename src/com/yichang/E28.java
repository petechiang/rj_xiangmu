package com.yichang;

public class E28 {

	public static void main(String[] args) {
		
			int result=divide(4,0);
			if (result==-1) {
				System.out.println("程序发生错误");
			} else {
				System.out.println(result);
			}
			
		
			
		
	}

	private static int divide(int i, int j) {
		try {
			int result = i/j;
			return result;
		} catch (Exception e) {
			System.out.println("捕获异常信息:"+e.getMessage());
		}finally {
			System.out.println("无论如何都要执行finally代码块");
		}
			return -1;
	}

	
}
