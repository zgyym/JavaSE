package com.bjpowernode.javase.chapter17;

public class Test01{
	public static void main(String[] args){

		// ����HelloWorld����
		// HelloWorld������������com.bjpowernode.javase.chapter17.HelloWorld
		com.bjpowernode.javase.chapter17.HelloWorld hw = new com.bjpowernode.javase.chapter17.HelloWorld();

		System.out.println(hw); //com.bjpowernode.javase.chapter17.HelloWorld@28a418fc

		// ��������ʡ����
		// ˼��������İ���֮���Կ���ʡ�ԣ�����ΪHelloWorld��Test01��ͬһ��package�¡�
		HelloWorld hw2 = new HelloWorld();
		System.out.println(hw2); //com.bjpowernode.javase.chapter17.HelloWorld@5305068a
	}
}