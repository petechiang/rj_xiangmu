package com.interface_;

//接口关键字：interface
interface Aniaml {
	// 接口的成员变量声明时，可以省略public static final三个关键字
	int ID = 1;

	// 接口的普通成员方法声明时可以省略public abstract两个关键字
	void shout();

	// 接口内不能有普通方法，可以有静态方法
	static int getID() {
		return Aniaml.ID;
	}

}

interface LandAnimal extends Aniaml {
	void run();
}

// 实现接口的功能用implements关键字
class Dog implements LandAnimal {
	int id;

	public Dog() {
		super();
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void run() {
		System.out.println("小狗在跑");
	}

	@Override
	public void shout() {
		System.out.println("汪汪....");
	}

}

class Cat implements Aniaml {

	@Override
	public void shout() {
		System.out.println("喵喵......");

	}

}

public class E13 {

	public static void main(String[] args) {
		System.out.println(Aniaml.getID());
		Dog dog = new Dog();
		dog.shout();
		dog.run();
		Cat cat = new Cat();
		cat.shout();
	}

}


interface I{
	void a();
	void b();
}
interface L{}
interface P{}
interface M extends L{}
abstract class H implements I,L{

}
class N extends H implements M,P{

	@Override
	public void a() {
		
		
	}

	@Override
	public void b() {
		
		
	}

	
	
}