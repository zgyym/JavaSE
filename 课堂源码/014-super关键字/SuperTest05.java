
/*
	1����this.���͡�super.���󲿷�����¶��ǿ���ʡ�Եġ�
	2��this. ʲôʱ����ʡ�ԣ�
		public void setName(String name){
			this.name = name;
		}
	3��super. ʲôʱ����ʡ�ԣ�
		�����У��������У�����������з��ʡ�������������super. ����ʡ�ԡ�
*/
public class SuperTest05{
	public static void main(String[] args){
		Vip v = new Vip("����");
		v.shopping();
		//�����ж�����һ����Ҫ��������ʵ�������ķ���i������������new��һ�������͵�����ָ�������͵Ķ���
		//��ʱ�����������е����������i
		//����i�е�ʵ���������Ǹ����е�ֵ�������������е�ֵ
		/*
		��һ����̳�����һ���࣬������û�и���ķ���ʱ��������Ķ�����÷���ʱ���������������в��ң�
		���������û�иķ������ٵ������в��ҡ�

		��һ������ֻ�ڸ����ж���ʱ�����ø÷���ʱ��ʹ�ø����е����ԡ�
		����÷������ֵ�����������������ô���ǰ���֮ǰ��˳�����������в��ң����ڸ����в��ҡ�

		*/

		v.doSome();
	}
}
class Customer {
	String name;
	public Customer(){}
	public Customer(String name){
		super();
		this.name = name;
	}

	public void doSome(){
		System.out.println(this.name + " do some!");
		System.out.println(name + " do some!");
		//����: �Ҳ�������
		//System.out.println(super.name + " do some!");
	}
}
class Vip extends Customer{

	// ��������Ҳ��һ��ͬ������
	// java�������������г��ֺ͸���һ����ͬ������/ͬ�����ԡ�
	String name; // ʵ������

	public Vip(){
	}
	public Vip(String name){
		super(name);
		//this.name = null;
	}
	public void shopping(){
		/*
			java����ô����������͸����ͬ�����Եģ�
				this.name����ǰ�����name����
				super.name����ǰ����ĸ����������е�name���ԡ�
		*/
		System.out.println(this.name + "���ڹ���!"); // null ���ڹ���
		System.out.println(super.name + "���ڹ���!"); // �������ڹ���
		System.out.println(name + "���ڹ���!"); //null ���ڹ���
	}
	
	
}
