package com.company;

import java.util.ArrayList;;
import java.util.LinkedList;
/*测试ArrayList插入速度慢于linkedList by yaleitian
 */
public class Main {
    public long startTime, endTime;
    public void test1 () {
        ArrayList<Integer> arrInt = new ArrayList<Integer>();
       startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            arrInt.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(arrInt);
        System.out.println("程序运行共耗时：" + (endTime-startTime) + "ms");
    }

    public void test2 () {
        LinkedList<Integer> arrInt = new LinkedList<Integer>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++){
            arrInt.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println(arrInt);
        System.out.println("程序运行共耗时：" + (endTime-startTime) + "ms");
    }


    public long getUsedTime() {
        test1();
        test2();
        return endTime - startTime;
    }

    public static void main(String[] args) {
	// write your code here
        Thread thread = new Thread();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("100");
//        System.out.println("Hello World");
//        System.out.println(arr);
        Main main = new Main();
//        main.start();
        main.getUsedTime();
    }
}
