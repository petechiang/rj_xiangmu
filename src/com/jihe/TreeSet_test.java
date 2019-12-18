package com.jihe;

import java.util.TreeSet;

public class TreeSet_test {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
	//如果往TreeSet里插入整数，由于整数所在的Integer类implements Comparable
		//这个接口，所以TreeSet可以对它们进行排序
		ts.add(25);
		ts.add(8);
		ts.add(17);
		ts.add(17);
		ts.add(13);
		ts.add(11);
		ts.add(1);
		ts.add(15);
		System.out.println("创建的TreeSet为"+ts);
		System.out.println("TreeSet首元素为"+ts.first());
		System.out.println("TreeSet中小于等于9的最大一个元素为"+ts.floor(9));
		System.out.println("TreeSet中大于9的最小一个元素为"+ts.higher(9));
		ts.pollLast();
		System.out.println("TreeSet删除最后一个元素以后"+ts);
		

	}

}
