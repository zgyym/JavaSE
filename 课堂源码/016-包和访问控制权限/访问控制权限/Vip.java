package com.bjpowernode3; // ���仯�ˡ�

// ����
import com.bjpowernode.User;

// User��com.bjpowernode���¡�
// Vip��com.bjpowernode3���¡�
// User��Vip����ͬһ�����¡�
// ����Vip��User�����ࡣ
public class Vip extends User{

	//ʵ������
	public void shopping(){
		// this��ʾ��ǰ����
		// protected����
		System.out.println(this.age);
		// ����Ĭ�� ���С�
		//System.out.println(this.name);
	}

}