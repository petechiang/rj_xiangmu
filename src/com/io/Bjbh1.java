package com.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bjbh1 {

	public static void main(String[] args) throws Exception {
		// 定义一个文件的对象
		Path bjxx = Paths.get("D:\\班级信息.txt");
		Path bjmc = Paths.get("D:\\班级名称.txt");
		Path bjbh = Paths.get("D:\\班级编号.txt");
		List<String> neirong = new ArrayList<>();
		Files.createFile(bjbh);

		// 读取文件中的内容
		List<String> lines = Files.readAllLines(bjxx);
		List<String> names = Files.readAllLines(bjmc);
		Map<String, String> map=new HashMap<>();
		for (String line : lines) {
			String[]  zfcsz=line.split("\t");
			map.put(zfcsz[1], zfcsz[0]);
		}
		for (String name : names) {
			String bjbh_=map.get(name);
			neirong.add(bjbh_);
		}
		System.out.println(map);
		//把集合里的内容写入文件
		Files.write(bjbh, neirong, StandardOpenOption.APPEND);
	}

}
