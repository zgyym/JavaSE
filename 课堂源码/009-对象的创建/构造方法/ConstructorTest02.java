
/*
	1�����췽����Ӧ��Ӣ�ﵥ�ʣ�Constructor����������
	2�����췽�����ã�
		�������󣬲��Ҵ�������Ĺ����и����Ը�ֵ����ʼ������
*/
public class ConstructorTest02{
	public static void main(String[] args){

		User u = new User();

		System.out.println(u.id); //111
		System.out.println(u.name); //lisi
		System.out.println(u.age); //30

		User u2 = new User(1111111);
		System.out.println(u2.id); //0
		System.out.println(u2.name); // null
		System.out.println(u2.age); // 0
	}
}