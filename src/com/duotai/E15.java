package com.duotai;
abstract class Animal{
	abstract void shout();
}
class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("wangwang....");
		
	}
	
}
class Cat extends Animal{
	
	@Override
	public void shout() {
		System.out.println("miaomiao....");
		
	}
	
}
public class E15 {

	public static void main(String[] args) {
		Animal dog=new Dog();
		Animal cat=new Cat();
		dog.shout();
		cat.shout();
		Employee e=new Manager();
		Director d=new Director();
		/*Manager m=new Director();
		Manager k=new Employee();*/
	}

}
class Employee{}
class Manager extends Employee{}
class Director extends Employee{}


