package com.jihe;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
class Customcomparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
	
}
public class Bct_2 {

	public static void main(String[] args) {
		Map<String,String> tmap=new TreeMap<String,String>(new Customcomparator());
		tmap.put("2", "John");
		tmap.put("1", "Lucy");
		tmap.put("3", "Smith");
		tmap.put("5", "Amanda");
		tmap.put("4", "aimee");
		System.out.println("用键集遍历双列集合的键和值");
		//将双列集合Map变成单列的键对象集合使用keySet()方法
		Set<String> jianji=tmap.keySet();
		Iterator<String> diedai=jianji.iterator();
		while (diedai.hasNext()) {
			Object key = (Object) diedai.next();
			Object value=tmap.get(key);
			System.out.println(key+":"+value);
		}

	}

}
