
// ��һ���������
// �ڶ���������UserTest���main��������������Ҫѹջ����
public class UserTest{

	// �������������ı���������Ա������
	//User u1; //��Ա��������ʵ��������

	public static void main(String[] args){
		//int i = 100;

		// �����嵱�������ı��������ֲ�����
		User u1 = new User();
		// ʵ��������ô���ʣ�������ô���ʣ���
		// �﷨�ǣ�������.��������
		System.out.println(u1.id); //0
		System.out.println(u1.username); //null
		System.out.println(u1.password); //null

		u1.id = 11111;
		u1.username = "zhangsan";
		u1.password = "123";

		System.out.println(u1.id);
		System.out.println(u1.username);
		System.out.println(u1.password);
		
		User u2 = new User();
		u2.id = 22222;
		u2.username = "lisi";
		u2.password = "456";

		System.out.println(u2.id);
		System.out.println(u2.username);
		System.out.println(u2.password);
	}
}