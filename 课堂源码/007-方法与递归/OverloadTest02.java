
/*
ʹ�÷������ػ��ơ����֮ǰ������ȱ�㡣
�ŵ�1�������������ۡ�
�ŵ�2�����������ơ��ģ������á���������ͬ�����������Ժ�Ĵ����д��

��java�����У�����ô���з������ֵ��أ�
	����java��������ͨ���������������֡�
	������java����������������ͬ��������֡�
	�����������ͬ������£���������ͨ�������Ĳ������ͽ��з��������֡�
*/
public class OverloadTest02{
	public static void main(String[] args){
		// ���ڳ���Ա��˵��ֻ��Ҫ����һ�����������ɡ�
		System.out.println(sum(10, 20));
		System.out.println(sum(10L, 20L));
		System.out.println(sum(10.0, 20.0));
	}
	// ����һ������int�������ݵ���ͷ���
	public static int sum(int a, int b){
		System.out.println("int���");
		return a + b;
	}

	// ����һ������long�������ݵ���ͷ���
	public static long sum(long a, long b){
		System.out.println("long���");
		return a + b;
	}

	// ����һ������double�������ݵ���ͷ���
	public static double sum(double a, double b){
		System.out.println("double���");
		return a + b;
	}
}