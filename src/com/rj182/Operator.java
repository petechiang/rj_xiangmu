package com.rj182;

public class Operator {

	public static void main(String[] args) {
		//算术运算符
		int i=1;
		int j=1;
		System.out.println("后加,表达式i++="+(i++));
		System.out.println("先加,表达式++j="+(++j));
		System.out.println("不管做先加还是后加以后变量的值都加了1,i="+i);
		System.out.println("不管做先加还是后加以后变量的值都加了1,j="+j);
		//赋值运算符 
		int a=2;
		a+=3;//等价于a=a+3
		System.out.println(a);
		//比较运算符
		String s1="hello";
		String s2="hello";
		E01 e1=new E01();
		E01 e2=new E01();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
		//逻辑运算符  & | !  &&  ||
		
		int x=0,y=0,z=0;
		boolean b1,b2;
		b1=x>0&y++>1;
		//&是逻辑与符号，尽管&左边的值为false，右边也要进行判断
		System.out.println("b1="+b1);
		System.out.println("y="+y);
		
		b2=x>0&&z++>1;
		//&&是短路与符号，只要&&左边的值为false，右边就不进行判断
		System.out.println("b2="+b2);
		System.out.println("z="+z);
		
		//条件运算符 ?:
		int store=95;
		System.out.println(store<=0?"库存没了！":store>100?"库存太多了":"库存量为"+store);
	}

}
