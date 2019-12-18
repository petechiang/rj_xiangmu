package com.jihe;

import java.util.TreeSet;
class Teacher extends Object implements Comparable<Object>{
    String name;
    int age;
    
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override//重写Object类的toString
	public String toString() {
		return  name + ":" + age;
	}

	@Override//重写Comparable接口的compareTo方法
	public int compareTo(Object obj) {
		Teacher t=(Teacher)obj;
		
		return t.age-this.age;
	}
	
}
public class TreeSet_test2 {

	public static void main(String[] args) {
		TreeSet<Teacher>	ts=new TreeSet<Teacher>();
		ts.add(new Teacher("马红云",30));
		ts.add(new Teacher("陈勇军",33));
		ts.add(new Teacher("张丽平",31));
		ts.add(new Teacher("陈勇军",33));
		System.out.println(ts);
		
	}

}
