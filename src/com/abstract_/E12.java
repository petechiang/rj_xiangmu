package com.abstract_;
abstract class Aniaml{
	public abstract void shout();
	void a() {}
}
class Dog extends Aniaml{
	int id;
	
	public Dog() {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void shout() {
		System.out.println("汪汪......");
		
	}
	
}
class Cat extends Aniaml{

	@Override
	public void shout() {
		System.out.println("喵喵......");
		
	}
	
}
public class E12 {

	public static void main(String[] args) {
	
		Dog dog=new Dog();
		dog.shout();
		Cat cat=new Cat();
		cat.shout();
	}

}
