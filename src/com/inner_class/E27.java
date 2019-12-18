package com.inner_class;
@FunctionalInterface
interface _Printable{
	void print(StringUtils su,String str);
}

public class E27 {

	public static void main(String[] args) {
		
		printUpper(new StringUtils(),"Hello",(object,t)->object.printUpper(t));
		printUpper(new StringUtils(),"World",StringUtils::printUpper);
	}

	private static void printUpper(StringUtils su, String str, _Printable pt) {
		pt.print(su, str);
	}

	

}
