/*
	�������ػ��ƣ�
		1�����³����Ȳ�ʹ�÷������ػ��ƣ����������ȱ�㣿����
			���³���û���﷨��������Ҳ�������ģ���ͷ���һ�´��������ʲôȱ��!

			sumInt��sumLong��sumDouble���ǹ��ܡ���ͬ�����ǹ��ܡ����ơ���

			�����������ܲ�ͬ���������ƣ��ֱ�����������ͬ�����֣���ʲôȱ�㣿

			ȱ�����������
				��һ�������벻���ۣ����ÿ��������룩�������Ǵ�Ҫ�ġ�
				�ڶ���������Ա��Ҫ�������ķ������ƣ�����Ա�Ƚ��ۡ�

*/
public class OverloadTest01{
	//������
	public static void main(String[] args){
		int x = sumInt(10, 20);
		System.out.println(x);

		long y = sumLong(10L, 20L);
		System.out.println(y);

		double z = sumDouble(10.0, 20.0);
		System.out.println(z);
	}

	// ����һ������int�������ݵ���ͷ���
	public static int sumInt(int a, int b){
		return a + b;
	}

	// ����һ������long�������ݵ���ͷ���
	public static long sumLong(long a, long b){
		return a + b;
	}

	// ����һ������double�������ݵ���ͷ���
	public static double sumDouble(double a, double b){
		return a + b;
	}
}
