/*
	1����java������boolean����ֻ������ֵ��û������ֵ��
		true��false��
		����C����C++��C������1��0Ҳ���Ա�ʾ�������͡�

	2��boolean������ʵ�ʿ�����ʹ���������أ�
		ʹ�����߼��жϵ��У�ͨ���ŵ�������λ���ϣ��䵱������
*/
public class BooleanTest01{
	public static void main(String[] args){
		//����: �����ݵ�����: int�޷�ת��Ϊboolean
		//boolean xingBie = 1;

		// ����涨�����Ϊtrue���ʾ�У�Ϊfalse���ʾŮ��
		//boolean sex = true;
		boolean sex = false;

		int a = 10;
		int b = 20;
		System.out.println(a < b); // true
		System.out.println(a > b); // false

		//boolean flag = a < b;
		boolean flag = (a < b); // ������������ȼ��ģ���ȷ�����Լ�С���š�����С���ž�һ������ִ�еġ�
		System.out.println(flag); // true

		// �������ǻ�ѧϰif���
		// if�����һ���������
		// ����ʵ��ʲô�����أ����磺���A�˻���Ǯ���㣬�ſ�����B�˻�ת�ˡ�
		// ���磺������������ֵ��true�����ʾ���ԣ�Ϊfalse���ʾŮ�ԡ�
		if(sex){
			System.out.println("��");
		}else{
			System.out.println("Ů");
		}

		// ���ϵ�if��俴����û��ϵ�������ѧϰ��
	}
}