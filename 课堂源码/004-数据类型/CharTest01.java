/*
	�ַ��ͣ�
		char

		1��charռ��2���ֽڡ�
		2��char��ȡֵ��Χ��[0-65535]
		3��char����unicode���뷽ʽ��
		4��char���͵�������ʹ�õ�������������
		5��char���Դ洢һ�����֡�
*/
public class CharTest01{
	public static void main(String[] args){
		// char���Դ洢1��������
		// ���Եģ�����ռ��2���ֽڣ�java�е�char����ռ��2���ֽڣ����á�
		char c1 = '��';
		System.out.println(c1);

		char c2 = 'a';
		System.out.println(c2);

		// 0������ϵ����ŵĻ���0�Ͳ�������0�ˣ���������0������1���ַ���
		char c3 = '0';
		System.out.println(c3);

		// ����: �����ݵ�����: String�޷�ת��Ϊchar
		//char c4 = "a";

		// ����: δ�������ַ�����
		//char c5 = 'ab';

		// ����: δ�������ַ�����
		//char c6 = '1.08';

	}
}