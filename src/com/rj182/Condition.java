package com.rj182;

import java.io.IOException;

public class Condition {

	public static void main(String[] args) throws IOException {
		// if else条件 可以是范围
		int age = 17;
		if (age < 12)
			System.out.println("此人是儿童");

		else if (age < 18)
			System.out.println("此人未成年");
		// switch case条件条件是离散的
		System.out.println("请输入当前月份:");
		int month = System.in.read()-'0';
		int t;
		if((t=System.in.read()-'0')>=0)
			//System.out.println(month+"-"+t);
			month=month*10+t;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("当前时间为冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("当前时间为春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("当前时间为夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("当前时间为秋季");
			break;

		default:
			break;
		}
	}

}
