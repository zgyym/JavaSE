package com;

// ����Ҫ���ർ�롣
//import com.bjpowernode.javase.chapter17.HelloWorld;
import com.bjpowernode.javase.chapter17.*;

public class Test02{
	public static void main(String[] args){
		/*
			Test02��com���¡�
			HelloWorld��com.bjpowernode.javase.chapter17�¡�
			����ͬһ��package�£���������ʡ����
				����ʡ�ԡ�
		*/
		//����: �Ҳ�������
		/*
		HelloWorld hw = new HelloWorld();
		System.out.println(hw);
		*/

		/*
		com.bjpowernode.javase.chapter17.HelloWorld hw = new com.bjpowernode.javase.chapter17.HelloWorld();
		System.out.println(hw);

		com.bjpowernode.javase.chapter17.HelloWorld hw2 = new com.bjpowernode.javase.chapter17.HelloWorld();
		System.out.println(hw2);

		com.bjpowernode.javase.chapter17.HelloWorld hw3 = new com.bjpowernode.javase.chapter17.HelloWorld();
		System.out.println(hw3);
		*/

		HelloWorld hw1 = new HelloWorld();
		System.out.println(hw1);

		HelloWorld hw2 = new HelloWorld();
		System.out.println(hw2);
	}
}
