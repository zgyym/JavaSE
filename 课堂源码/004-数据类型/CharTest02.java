/*
	����java�е�ת���ַ�
		java�����С�\������ת�塣
			\t ��ʾ�Ʊ��tab
*/
public class CharTest02{
	public static void main(String[] args){

		// ��ͨ��'t'�ַ�
		char c1 = 't';
		System.out.println(c1);
		
		//char x = 'ab';

		// ����֮ǰ��ѧ�����´���Ӧ�ñ���
		// �����������´��� \t ʵ������1���ַ����������ַ���
		// �����ַ�����һ���ʾһ���ַ������� \t ��ʾ���Ʊ��tab��
		char c2 = '\t'; //�൱�ڼ����ϵ�tab��

		System.out.println("abcdef");
		System.out.println("abctdef");
		// \�ĳ��ֻὫ�����ŵĺ�����ַ�����ת�塣\����t��ʾtab����
		System.out.println("abc\tdef");
		
		/*
			System.out.println(); ����
			System.out.print(); ������
		*/
		System.out.print("HelloWorld");
		System.out.println("123abcdef");

		System.out.print("abc");
		//char c3 = 'n'; // ��ͨ��n�ַ�
		char c3 = '\n'; // ���з�
		//System.out.print(c3);
		System.out.println(c3);
		System.out.println("def"); 

		// �����������ڿ���̨���һ�� ' �ַ���ô�죿
		// ����: ���ַ�����
		//System.out.println(''');
		// \' ��ʾһ����ͨ��������ͨ�ĵ������ַ�����\'����������ʾһ����ͨ�� '��
		System.out.println('\'');

		// �����������ڿ���̨���һ�� \ �ַ���ô�죿
		//����: δ�������ַ�����
		//System.out.println('\');
		// ��java��������б�ܴ�����һ������ͨ�ķ�б���ַ���
		System.out.println('\\');

		// ˫���������������ַ���
		System.out.println("test");
		// ϣ������Ľ���ǣ�"test"
		// ����: ��Ҫ')'
		//System.out.println(""test"");
		System.out.println("��test��"); //�ڲ���˫�����������ĵ����𣿿��ԡ�

		System.out.println("");
		// ���뱨��
		//System.out.println(""");
		//System.out.println("\"");
		System.out.println("\"test\"");

		// ������������
		// �������Ҫר�Ž���ת�塣
		// ��� ' ������ֻ��һ����ͨ���ַ������߱����⺬�塣
		System.out.println("'");

		//���¶�������
		//System.out.println(''');
		//System.out.println(""");

		// ���Եġ�
		System.out.println("'������'");

		// ���뱨����Ϊ��4e2d ��һ���ַ���
		// ����: δ�������ַ�����
		//char x = '4e2d';

		// ��б��u��ʾ�������һ���ַ���unicode���롣
		// unicode������ʮ�����Ƶġ�
		char x = '\u4e2d';
		System.out.println(x); // '��'
	}
} 
/*
ʮ�����ƣ���16��1λ��
	1 2 3 4 5 6 7 8 9 a b c d e f 10
	11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20...

�˽��ƣ�
	0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20.....
*/