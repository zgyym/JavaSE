
/*
	�ڸ���������ͬ�������ԣ�����˵����ͬ�ķ�����
	�����ʱ���������з��ʸ��е����ݣ�����ʹ�á�super.���������֡�

	super.������    �����ʸ�������ԡ�
	super.������(ʵ��) �����ʸ���ķ�����
	super(ʵ��)  �����ø���Ĺ��췽����
*/
public class SuperTest07{
	public static void main(String[] args){
		/*
			Cat move!
			Cat move!
			Animal move!
		*/
		Cat c = new Cat();
		c.yiDong();
	}
}

class Animal{
	public void move(){
		System.out.println("Animal move!");
	}
}

class Cat extends Animal{
	// ��move������д��
	public void move(){
		System.out.println("Cat move!");
	}

	// ������дһ���������еķ�����
	public void yiDong(){
		this.move();
		move();
		// super. �������Է������ԣ�Ҳ���Է��ʷ�����
		super.move();
	}
}