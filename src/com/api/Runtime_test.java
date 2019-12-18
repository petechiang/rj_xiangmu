package com.api;

import java.io.IOException;

public class Runtime_test {

	public static void main(String[] args)  {
		Runtime rt=Runtime.getRuntime();
		System.out.println("本机处理器的个数是"+rt.availableProcessors()+"个");
		System.out.println("空闲内存大小是"+rt.freeMemory()/1024/1024+"MBytes");
		System.out.println("最大内存大小是"+rt.maxMemory()/1024/1024+"MBytes");
		
		Process jincheng;
		try {
			jincheng = rt.exec("mspaint");
			Thread.sleep(3000);
			jincheng.destroy();
		} catch (IOException | InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		

	}

}
