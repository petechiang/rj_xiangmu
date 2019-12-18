package com.rj182;  //package:包
/*
紫色的代码是关键字
褐色的代码是方法的参数或者方法里的局部变量
蓝色的代码是字符常量或者类里的方法外的成员变量,它的地位比局部变量高，地位同成员方法一样
黑色的代码是标识符或者整型常量：包名(com、rj182)、类名(Zhengshuleixing、String、System)
				   方法名(main、println)
				
*/
public class Jibenleixing {   //class:类  public：修饰符 表示公有的
    byte b2=1;
	public static void main(String[] args) {
		//static:修饰符 表示静态的  void：空的 表明该方法没有返回值
		byte b=1; //00000001
		short s=1;//00000000 00000001
		int i=1;  //00000000 00000000 00000000 00000001
		long l=1;//00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001
		
		float f=1.0f;//1.0是双精度浮点数长度是64位，而float是32位
		             //1.0f是单精度浮点数长度是32位
		double d=1.0;
		
		char c='a';//用单引号将字符常量括起来
		char ci=97;
		short  cc=97;
		
		boolean flag1=true;
		boolean flag2=false;
		
		
		System.out.println(c);
		System.out.println(ci);
		System.out.println((char)cc);
		
		System.out.println("字节型整数数据的长度是"+Byte.SIZE);
		System.out.println("短整型整数数据的长度是"+Short.SIZE);
		System.out.println("整型整数数据的长度是"+Integer.SIZE);
		System.out.println("长整型整数数据的长度是"+Long.SIZE);
		
		System.out.println("单精度浮点型数据的长度是"+Float.SIZE);
		System.out.println("双精度浮点型数据的长度是"+Double.SIZE);
		
		System.out.println("字符型数据的长度是"+Character.SIZE);
		
		
		System.out.println("字节型整数数据的范围是"+Byte.MIN_VALUE+"-"+Byte.MAX_VALUE);
		System.out.println("短整型整数数据的范围是"+Short.MIN_VALUE+"-"+Short.MAX_VALUE);
		System.out.println("整型整数数据的范围是"+Integer.MIN_VALUE+"-"+Integer.MAX_VALUE);
		System.out.println("长整型整数数据的范围是"+Long.MIN_VALUE+"-"+Long.MAX_VALUE);
	
		System.out.println("单精度浮点型数据的范围是"+Float.MIN_VALUE+"-"+Float.MAX_VALUE);
		
		//1.4*10^-45  -  3.4028235*10^38  
		//-3.4028235*10^38  -   -1.4*10^-45
		System.out.println("双精度浮点型数据的范围是"+Double.MIN_VALUE+"-"+Double.MAX_VALUE);
		
		//字符型数据可以转换成整数，布尔型数据不可以转换成整数
		System.out.println("字符型数据的范围是"+(int)Character.MIN_VALUE+"-"+(int)Character.MAX_VALUE);
		System.out.println("布尔型数据的范围是"+Boolean.TRUE+"-"+Boolean.FALSE);
	}

}
