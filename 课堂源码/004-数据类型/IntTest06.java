/*
	���ۣ�byte��char��short����������ʱ�򣬸�����ת����int�������㡣
*/
public class IntTest06{
	public static void main(String[] args){

		char c1 = 'a';
		byte b = 1;

		// ע�⣺�����"+"�Ǹ�����͵�
		System.out.println(c1 + b); // 98

		// ����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		//short s = c1 + b; // ��������֪������ӷ����Ľ���Ƕ��١�ֻ֪����int���͡�

		// �����޸�����
		//����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		//short s = (short)c1 + b;

		short s = (short)(c1 + b);

		//short k = 98;

		int a = 1;
		//����: �����ݵ�����: ��intת����short���ܻ�����ʧ
		// short x = 1; ����
		short x = a; // �����ԣ�������ֻ֪��a��int���ͣ���֪��a�д洢�����ĸ�ֵ��
		System.out.println(x);
	}
}