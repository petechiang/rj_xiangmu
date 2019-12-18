package com.inner_class;

import javax.print.attribute.standard.PrinterName;

@FunctionalInterface
interface PersonBuilder{
	Person buildPerson(String name);
}
class Person{
	private String name;

	public String getName() {
		return name;
	}

	public Person(String name) {
		super();
		this.name = name;
	}
	
}
public class E26 {

	public static void main(String[] args) {
		printerName("郭富城",new PersonBuilder() {
			
			@Override
			public Person buildPerson(String name) {
				// TODO 自动生成的方法存根
				return new Person(name);
			}
		});
		printerName("张学友",name->new Person(name));
		printerName("刘德华", Person::new);

	}

	private static void printerName(String name, PersonBuilder pb) {
		System.out.println(pb.buildPerson(name).getName());
		
	}

}
