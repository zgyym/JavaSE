/*
	this��
		1��this��һ���ؼ��֣�ȫ��Сд��
		2��this��ʲô�����ڴ淽���������ģ�
			һ������һ��this��
			this��һ����������һ�����á�this���浱ǰ������ڴ��ַ��ָ������
			���ԣ��ϸ���������˵��this����ľ��ǡ���ǰ����
			this�洢�ڶ��ڴ浱�ж�����ڲ���

		3��thisֻ��ʹ����ʵ�������С�˭�������ʵ��������this����˭��
		����this������ǣ���ǰ����

		4����this.���󲿷�������ǿ���ʡ�Եġ�

		5��Ϊʲôthis����ʹ���ھ�̬�����У�����������
			this����ǰ���󣬾�̬�����в����ڵ�ǰ����
*/
public class ThisTest01{
	public static void main(String[] args){

		Customer c1 = new Customer("����");
		c1.shopping();

		Customer c2 = new Customer("����");
		c2.shopping();

		Customer.doSome();
	}
}

// �˿���
class Customer{

	// ����
	// ʵ��������������á�����.���ķ�ʽ���ʣ�
	String name;   

	//���췽��
	public Customer(){
	
	}
	public Customer(String s){
		name = s;
	}

	// �˿͹���ķ���
	// ʵ������
	public void shopping(){
		// �����this��˭��this�ǵ�ǰ����
		// c1����shopping(),this��c1
		// c2����shopping(),this��c2
		//System.out.println(this.name + "���ڹ���!");

		// this. �ǿ���ʡ�Եġ�
		// this. ʡ�ԵĻ�������Ĭ�Ϸ��ʡ���ǰ���󡱵�name��
		System.out.println(name + "���ڹ���!");
	}

	// ��̬����
	public static void doSome(){
		// this������ǵ�ǰ���󣬶���̬�����ĵ��ò���Ҫ����ì���ˡ�
		// ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� this
		//System.out.println(this);
	}
}


class Student{

	// ʵ����������ô���ʣ�������new����ͨ��������.�������ʡ�
	String name = "zhangsan";

	// ��̬����
	public static void m1(){
		//System.out.println(name);

		// this������ǵ�ǰ����
		//System.out.println(this.name);

		// ����������
		Student s = new Student();
		System.out.println(s.name);

	}

	//Ϊʲôset��get������ʵ��������
	public static void setName(String s){
		name = s;
	}
	public String getName(){
		return name;
	}

	// �ֻص�����������ˣ�ʲôʱ�򷽷�����Ϊʵ��������ʲôʱ����Ϊ��̬������
	// ���������ֱ�ӷ�����ʵ���������÷���������ʵ��������
}