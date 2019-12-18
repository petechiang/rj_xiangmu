package com.rj182;

public class Bubble_sort {

	public static void main(String args[]) {
		int[] array= {9,8,3,5,2};
		System.out.println("这个数组的长度是"+array.length);
		//foreach循环 
        for (int szys:array) {
			System.out.print(szys+" ");
		}
        
        System.out.println();//换行
        /*冒泡排序第一趟: 8352  9
         * 冒泡排序第二趟:352 89
         * 冒泡排序第三趟:32 589
         * 冒泡排序第四趟:23589
        */
        //定义外循环，表示趟数
        for(int m=1;m<array.length;m++) {
        	//定义内循环，比较第m趟要比较的多个数，两两比较
        	for(int n=0;n<array.length-m;n++) {
        		
        		//98352
        		if(array[n]>array[n+1])
        		{
        			int temp=array[n];
        			array[n]=array[n+1];
        			array[n+1]=temp;
        		}
        	}
        }
        //foreach循环里的 ：读作集合中的每一个元素
        for (int szys:array) {
			System.out.print(szys+" ");
		}
	}

}
