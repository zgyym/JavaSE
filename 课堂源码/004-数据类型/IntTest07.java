/*
	���ۣ�����������������������ʱ�����յĽ�������ǡ������������Ӧ�����͡�

	char+short+byte ������⡣
	��Ϊchar + short + byte��������ʱ�򣬻������ת����int�������㡣
*/
public class IntTest07{
	public static void main(String[] args){
		
		long a = 10L;
		char c = 'a';
		short s = 100;
		int i = 30;

		// ���
		System.out.println(a + c + s + i); //237

		// ����: �����ݵ�����: ��longת����int���ܻ�����ʧ
		// ��������long����
		//int x = a + c + s + i;

		int x = (int)(a + c + s + i);
		System.out.println(x);

		// ���³���ִ�н���ǣ�
		// java�й涨��int���ͺ�int�������յĽ������int���͡�
		int temp = 10 / 3; // / �ǳ��š�������ȡ����
		System.out.println(temp); // 3.33333�𣿽���ǣ�3

		// ��java�м�������һ���Ǿ�ȷ�ġ�
		int temp2 = 1 / 2;
		System.out.println(temp2); // 0

	}
}