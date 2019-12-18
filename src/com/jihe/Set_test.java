package com.jihe;

import java.util.ArrayList;
import java.util.HashSet;

public class Set_test {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		arrayList.add("stud4");
		System.out.println("来自数组列表的输出");
		arrayList.forEach(obj->System.out.println(obj));
		
//HashSet能够去掉重复元素,是因为HashSet里的String类已经重写了Object类的hashCode()以及equals()方法 
		HashSet<String> hset=new HashSet<String>();
		hset.add(new String("Jack"));
		hset.add(new String("Eva"));
		hset.add(new String("Rose"));
		hset.add(new String("Rose"));
		hset.add(new String("Pete"));
		System.out.println("来自哈希集的输出");
		hset.forEach(obj->System.out.println(obj));
		
//HashSet能够去掉重复元素,是因为HashSet里的Integer类已经重写了Object类的hashCode()以及equals()方法 		
		
		hset.removeAll(hset);
		HashSet<Integer> hset2=new HashSet<Integer>();
		hset2.add(4);
		hset2.add(1);
		hset2.add(2);
		hset2.add(3);
		hset2.add(5);
		hset2.add(5);
		System.out.println("来自哈希集的输出");
		hset2.forEach(obj->System.out.println(obj));
	}

}
