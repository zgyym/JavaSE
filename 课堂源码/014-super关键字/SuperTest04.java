public class SuperTest04{
	public static void main(String[] args){
		Vip v = new Vip("����");
		v.shopping();
	}
}
class Customer{
	String name;
	public Customer(){}
	public Customer(String name){
		super();
		this.name = name;
	}
}
class Vip extends Customer{
	public Vip(){}
	public Vip(String name){
		super(name);
	}
	// super��this�����ܳ����ھ�̬�����С�
	public void shopping(){
		// this��ʾ��ǰ����
		System.out.println(this.name + "���ڹ���!");
		// super��ʾ���ǵ�ǰ����ĸ�������������super��thisָ����Ǹ������е�һ��ռ䡣��
		System.out.println(super.name + "���ڹ���!");
		System.out.println(name + "���ڹ���!");
	}
}
