/*
	1�������ܷ�ֱ�Ӹ�ֵ��char
	2��char x = 97;
		���java���������ģ���������Ľ����'a'
		����������Եó��������ۣ�
			��һ�����ۣ���һ��������ֵ��char���ͱ�����ʱ�򣬻��Զ�ת����char�ַ��ͣ�
			���յĽ����һ���ַ���

			�ڶ������ۣ���һ������û�г���byte short char��ȡֵ��Χ��ʱ��
			�����������ֱ�Ӹ�ֵ��byte short char���͵ı�����
*/
public class CharTest03{
	public static void main(String[] args){
	
		char c1 = 'a';
		System.out.println(c1);

		// �����������ת����
		// 97��int���ͣ�����java�й涨��Ĭ�ϵ���int����
		// c2��char����
		//char c2 = (char)97; // ����Ҫ��������
		char c2 = 97;
		System.out.println(c2); // 'a'

		// char����ȡֵ��Χ��[0~65535]
		char c3 = 65535; // ʵ����������һ���������������ַ���
		System.out.println(c3);

		//����: �����ݵ�����: ��intת����char���ܻ�����ʧ
		//char c4 = 65536;

		// ��ô����������⣿
		char c4 = (char)65536;

		byte x = 1;
		short s = 1;
		char c = 1;

	}
}