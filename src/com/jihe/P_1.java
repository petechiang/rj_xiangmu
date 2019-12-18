package com.jihe;
import java.util.HashSet;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person other = (Person) obj;
		return this.name.equals(other.name);
	}
	@Override
	public String toString() {
		return name + ":" +age;
	}
	
}
public class P_1 {

	public static void main(String[] args) {
		Person p1=new Person("王帅",18);
		Person p2=new Person("谢雷",28);
		Person p3=new Person("王楠",16);
		Person p4=new Person("王帅",18);
		HashSet<Person> h1=new HashSet<Person>();
		h1.add(p1);
		h1.add(p2);
		h1.add(p3);
		h1.add(p4);
		System.out.println(h1);
	}

}
