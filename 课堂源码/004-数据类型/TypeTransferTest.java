public class TypeTransferTest{
	public static void main(String[] args){
		// ���뱨����Ϊ1000�Ѿ�������Χ�ˡ�
		//byte b1 = 1000;
		// ����
		byte b2 = 20;
		// ����
		short s = 1000;
		// ����
		int c = 1000;
		// ����
		long d = c;
		// ���뱨��
		//int e = d;
		// ����
		int f = 10 / 3;
		// ����
		long g = 10;
		// ���뱨��
		//int h = g / 3;
		// ����
		long m = g / 3;
		// ���뱨��
		//byte x = (byte)g / 3;
		// ����
		short y = (short)(g / 3);
		// ����
		short i = 10;
		// ����
		byte j = 5;
		// ���뱨��
		//short k = i + j;
		// ����
		int n = i + j;
		// ����
		char cc = 'a';
		System.out.println(cc); // a
		System.out.println((byte)cc); // 97
		// cc �����Զ�ת����int���ͣ���������
		int o = cc + 100;
		System.out.println(o); // 197
	}
}