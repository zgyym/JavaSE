/*
	�̳к�ʵ�ֶ����ڵĻ�������Ӧ����ôд��
		extends �ؼ�����ǰ��
		implements �ؼ����ں�
*/
public class Test04{
	public static void main(String[] args){
		// �������󣨱��濴Animal��û�����ã���
		Flyable f = new Cat(); //��̬��
		f.fly();

		// ͬһ���ӿ�
		Flyable f2 = new Pig();
		// ����ͬһ��fly()����������ִ��Ч����ͬ��
		f2.fly();

		Flyable f3 = new Fish();
		f3.fly();
	}
}

// �����ࣺ����
class Animal{
}

// �ɷ���Ľӿڣ���һ�Գ��
// �ܲ�εľ��ǽӿڡ���û�нӿ�����ô��Ρ���
// �ڴ����嵽�����ϣ�����֮���нӿڡ��ڴ������Ը�����
// �ӿ�ͨ����ȡ������Ϊ������
interface Flyable{
	void fly();
}

// ���������ࣺè��
// Flyable��һ���ӿڣ���һ�Գ��Ľӿڣ�ͨ���ӿڲ嵽è���ϣ���è��Ŀ��Է��衣
class Cat extends Animal implements Flyable{
	public void fly(){
		System.out.println("��è��ɣ�����̫�յ�һֻè�������棬������һֻè����");
	}
}

// ���࣬����㲻�������ɣ����Բ�ʵ��Flyable�ӿ�
// û��ʵ������ӿڱ�ʾ��û�г��û�и��������϶����ܷɡ�
class Snake extends Animal{
}

// ��ɾͲ�������ӿڡ�
class Pig extends Animal implements Flyable{
	public void fly(){
		System.out.println("����һֻ��ɵ�������");
	}
}

// �㣨Ĭ��ʵ�����Ǵ��ڼ̳еģ�Ĭ�ϼ̳�Object����
/*
class Fish extends Object implements Flyable{
}
*/
class Fish implements Flyable{ //ûдextends��Ҳ���еģ�Ĭ�ϼ̳�Object��
	public void fly(){
		System.out.println("�������۷��㣨�������������");
	}
}