
// ������i������main�������ܲ��ܷ��ʣ�������

public class ThisTest02{

	// ʵ������
	int i = 100; // ���i�����ǲ��Ǳ�����new������ܷ��ʡ�

	// ��̬����
	static int k = 111;

	// ��̬����
	public static void main(String[] args){
		// ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� i
		// System.out.println(i);

		// ��ô������i
		ThisTest02 tt = new ThisTest02();
		System.out.println(tt.i);

		// ��̬�����á�����.�����ʡ�
		System.out.println(ThisTest02.k);

		// ����. �ܲ���ʡ�ԣ�
		// ����
		System.out.println(k);
	}
}