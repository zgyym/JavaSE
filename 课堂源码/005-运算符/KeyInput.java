/*
1�������Ϣ������̨��
	System.out.println(...);
2����java����ô���ռ��̵������أ�
	������һ�£�������뿴��������������Ϊ�����������������½�ѧϰ֮����ܹ���⡣
	��������Ժ���ճ�����С�

	ǰ�᣺java.util.Scanner s = new java.util.Scanner(System.in); 
	����һ��������ô�죿
		int num = s.nextInt();
		
	����һ���ַ�����ô�죿
		String str = s.next();
*/
public class KeyInput{
	public static void main(String[] args){

		// ����һ������ɨ��������
		// s �������������޸ġ��������ܸġ� 
		java.util.Scanner s = new java.util.Scanner(System.in); //���д���дһ�ξ����ˡ�

		// �����û������룬�Ӽ����Ͻ���һ��int���͵�����
		// �������д��룬�����ô�����ף�����ִ�е������ʱ�򣬻���ͣ����
		// �ȴ��û������룬�û����ԴӼ���������һ��������Ȼ��س����س�֮��
		// i��������ֵ�ˡ�����i�����б�������ֵ���û���������֡�
		// i�������ǽ��ռ������ݵġ�
		int i = s.nextInt(); // i�Ǳ�������s������ı�����
		System.out.println("������������ǣ�" + i);

		// ����ִ�е��˴��ֻ�ͣ�������ȴ��û������롣
		// ����س���s.nextInt();����ִ�н�����
		int j = s.nextInt();
		System.out.println("������������ǣ�" + j);

		// �������Ĳ������֣���ô����쳣��InputMismatchException
		int m = s.nextInt();
		System.out.println("������������ǣ�" + m);

		// ����ô�Ӽ����Ͻ���һ���ַ����أ�
		// ����ִ�е��˴���ͣ�������ȴ��û������룬�û����������ַ�����
		String str = s.next();
		System.out.println("�������ˣ�" + str);

		// �����ġ�
		System.out.print("�������û�����");
		String name = s.next();
		System.out.println("��ӭ"+name+"����");
	}
}