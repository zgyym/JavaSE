/*
���ԣ�����̳и���֮����ʹ�����������ø��෽����
	ʵ�������ϵ���������ʵ��е����Σ���������
	�������Σ�����ʹ�����������ø��෽����
	�����ϣ�����̳и���֮���ǽ�����̳й����ķ�����Ϊ�Լ����С�
	ʵ���ϵ��õ�Ҳ���Ǹ���ķ��������������Լ��ķ�������Ϊ�Ѿ��̳й�����
	�������Լ��ġ�����
		
*/
public class ExtendsTest04{
	public static void main(String[] args){
		// �����������
		Cat c = new Cat();
		// ���÷���
		c.move();
		// ͨ������������name������
		System.out.println(c.name);
	}
}

// ����
//class Animal extends Object {
class Animal{
	// ���֣��Ȳ���װ��
	String name = "XiaoHua"; //Ĭ��ֵ����null����һ��XiaoHua

	// �ṩһ�������ƶ��ķ���
	public void move(){
		System.out.println(name + "�����ƶ���");
	}
}

// Cat����
// Cat�̳�Animal���ὫAnimal�����е�ȫ���̳й�����
class Cat extends Animal{
}