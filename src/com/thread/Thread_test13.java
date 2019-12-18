package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TicketWindow5 implements Runnable {

	private int tickets = 10;
	// 定义锁
	private final Lock lock=new ReentrantLock();

	public void run() {
		while (tickets>0) {
			//加锁
			lock.lock();
			if (tickets > 0)
			{
			    try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}finally {
					//线程卖完后解锁
					lock.unlock();
				}
			   
			} 
			if (tickets > 0) {
				 System.out.println(Thread.currentThread().getName() + "正在卖第" + tickets-- + "张票");
			}
		}
}
}
public class Thread_test13 {

	public static void main(String[] args) {
		TicketWindow5 tw = new TicketWindow5();
		new Thread(tw, "窗口1").start();
		new Thread(tw, "窗口2").start();
		new Thread(tw, "窗口3").start();
		new Thread(tw, "窗口4").start();
	}

}