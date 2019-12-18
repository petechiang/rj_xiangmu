package com.rj182;

public class Break {

	public static void main(String[] args) {
		int x=1;
		while(x<6) {
			
			if(x==3) {
				x++;
				break;
			}
			System.out.println("x="+x);
			x++;
		}
		

	}

}
