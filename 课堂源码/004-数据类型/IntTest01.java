
/*
	��������java�����й�4�����ͣ�
		byte	1���ֽ�  ���ֵ127
		short	2���ֽ�  ���ֵ32767
		int	4���ֽ�  2147483647��int���ֵ�����������Χ����ʹ��long���͡�
		long	8���ֽ�

		1���ֽ� = 8��������λ
		1byte = 8bit

		�������ϵ��ĸ�������˵����õ���int��
		������ʱ���ý��ƽϣ�ֱ��ѡ��ʹ��int�����ˡ�
	
	��java��������������������4�ֱ�ʾ��ʽ��
		ʮ���ƣ���õġ�
		������
		�˽���
		ʮ������
*/
public class IntTest01{
	public static void main(String[] args){
		// ʮ����
		int a = 10; 
		System.out.println(a); // 10

		// �˽���
		int b = 010;
		System.out.println(b); // 8

		// ʮ������
		int c = 0x10;
		System.out.println(c); // 16

		int x = 16; //ʮ���Ʒ�ʽ
		System.out.println(x);

		// �����ƣ�JDK8�������ԣ��Ͱ汾��֧�֡���
		int d = 0b10;
		System.out.println(d); // 2
	}
}