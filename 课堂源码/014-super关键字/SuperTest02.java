
/*
	�жϳ����������
	1
	3
	6
	5
	4

	��java�����в�������newʲô������������ڵ�Object����޲������췽��
	һ����ִ�С���Object����޲������췽���Ǵ��ڡ�ջ��������

	ջ�����ص㣺
		�����ã���������ִ�н�����
		����ȳ�ԭ��
	
	���Ҫע�⣺
		�Ժ�д�����ʱ��һ������޲������췽�����ǽ������ֶ���д������
		����޲������췽����ʧ�Ļ������ܻ�Ӱ�쵽���������Ĺ�������

*/
public class SuperTest02{
	public static void main(String[] args){
		new C();

	}
}

/*
class Object{
	public Object(){	
	}
}
*/

class A extends Object{
	public A(){
		System.out.println("1"); //1
	}
}

class B extends A{
	public B(){
		System.out.println("2"); //2
	}
	public B(String name){
		super();
		System.out.println("3"); // 3
	}
}

class C extends B{
	public C(){ // ��������ȵ��õġ�������������
		this("zhangsan");
		System.out.println("4");//4
	}
	public C(String name){
		this(name, 20);
		System.out.println("5");//5
	}
	public C(String name, int age){
		super(name);
		System.out.println("6");//6
	}
}