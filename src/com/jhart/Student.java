package com.jhart;
//POJO
public class Student extends Person{
	//作用范围修饰符  
	//private : 类可见性   只在本类中可以使用，其他地方访问都是非法的
	//没有作用范围修饰符:包可见性  只在本包中可以使用，其他地方访问都是非法的
	//protected:子类可见性    只在本包或者其他包中的子类可以使用，其他地方访问都是非法的
	//public:公共访问级别   任何位置都可以访问
	//类的成员变量一般是private 这叫类的封装
	//如果要使用成员变量，使用public的getter setter方法

	private int score;//成绩成员属性
	//构造方法 修饰符public+类名(){}
	//无参构造方法
	public Student() {}
	//有参数的构造方法
	public Student(String name,int cj) {
		this.name = name;
		this.score = cj;
	}
	//读取姓名
	public String getName() {
		return name;
	}
	//设置姓名
	public void setName(String mz) {//mz是参数
		this.name = mz;
	}
	//读取成绩
	public int getScore() {
		return score;
	}
	//设置成绩
	public void setScore(int score) {
		this.score = score;
	}
	
	public static void main(String[] args) {
		//对象的创建  类名 对象名称  =  new  类名()  也就是new +构造方法
		Student s1=new Student();
		s1.setName("mike");
		s1.setScore(600);
		Student s2=new Student("serena",590);
		System.out.println(s1.name+"考了"+s1.getScore()+"分");
		System.out.println(s2.name+"考了"+s2.getScore()+"分");
		}
	
}
