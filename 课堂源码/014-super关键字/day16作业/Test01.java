/*
��������Ϸ
һ����A��һ��ʵ������v���Ӽ��̽���һ����������Ϊʵ������v�ĳ�ʼֵ��
�����ٶ���һ����B����A���ʵ������v���в²⡣
	�����������ʾ����
	С������ʾС��
	��������ʾ�²�ɹ�
*/

public class Test01{
	public static void main(String[] args){
		//����A����
		A a = new A(100);
		//����B����
		B b = new B(a);
		//��ʼ�²�
		java.util.Scanner s = new java.util.Scanner(System.in);
		while(true){
			System.out.print("������Ҫ�²�����֣�");
			int caiCeNum = s.nextInt();
			b.cai(caiCeNum);
		}
	}
}

class A{

	private int v;

	public A(){
	
	}
	public A(int v){
		this.v = v;
	}

	public void setV(int v){
		this.v = v;
	}

	public int getV(){
		return v;
	}
}

class B{

	// ͨ��B�²�A
	// ��B��������һ��A��������á�
	private A a; // ͨ����ѧ�ߣ��Ῠ�������֪��Ӧ��������д��
					 // ��֪����A����ΪB��һ�����ԡ�

	public B(){}

	public B(A a){
		this.a = a;
	}

	public void setA(A a){
		this.a = a;
	}

	public A getA(){
		return a;
	}

	// �²�ķ���
	public void cai(int caiCeNum){
		// ʵ������
		//int shiJiZhi = this.getA().getV();
		int shiJiZhi = a.getV();
		if(caiCeNum == shiJiZhi){
			System.out.println("�¶���");
			// ��ֹ�����ִ��
			// �˳�JVM
			System.exit(0); // ��ǰû��д�����˳�JVM��
		}else if(shiJiZhi > caiCeNum){
			System.out.println("��С��");
		}else{
			System.out.println("�´���");
		}
	}
}