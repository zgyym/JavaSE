/*
	switch��䣺
		1��switch���Ҳ��ѡ����䣬Ҳ���Խ�����֧��䡣
		2��switch�����﷨��ʽ

			switch(ֵ){
			case ֵ1:
				java���;
				java���;...
				break;
			case ֵ2:
				java���;
				java���;...
				break;
			case ֵ3:
				java���;
				java���;...
				break;
			default:
				java���;
			}

			������һ��������switch��䣺
				���У�break;��䲻�Ǳ���ġ�default��֧Ҳ���Ǳ���ġ�

			switch���֧�ֵ�ֵ����Щ��
				֧��int�����Լ�String���͡�
				��һ��Ҫע��JDK�İ汾��JDK8֮ǰ��֧��String���ͣ�ֻ֧��int��
				��JDK8֮��switch��俪ʼ֧���ַ���String���͡�

				switch��䱾������ֻ֧��int��String������byte,short,charҲ����
				ʹ����switch��䵱�У���Ϊbyte short char���Խ����Զ�����ת����

				switch����С�ֵ���롰ֵ1������ֵ2���Ƚϵ�ʱ���ʹ�á�==�����бȽϡ�

		3��switch����ִ��ԭ��
			�á�ֵ���롰ֵ1�����бȽϣ������ͬ����ִ�и÷�֧�е�java��䣬
			Ȼ������"break;"��䣬switch���ͽ����ˡ�

			�����ֵ���롰ֵ1������ȣ�������á�ֵ���롰ֵ2�����бȽϣ������ͬ��
			��ִ�и÷�֧�е�java��䣬Ȼ������break;��䣬switch������

			ע�⣺�����ִ֧���ˣ����Ƿ�֧���û�С�break;������ʱ�ᷢ��case
			��͸����

			���е�case��û��ƥ��ɹ�����ô���default��֧��ִ�С�
*/
public class SwitchTest01{
	public static void main(String[] args){
		
		// ������������Ƿ��ܹ�����ͨ����
		// switchֻ֧��int��String���͡�
		// ����: �����ݵ�����: ��longת����int���ܻ�����ʧ
		/*
		long x = 100L;
		switch(x){
		
		}
		*/

		/*
		long x = 100L;
		switch((int)x){
		
		}
		*/
		
		/*
		byte b = 100;
		switch(b){
		
		}
		*/

		/*
		short s = 100;
		switch(s){
		
		}
		*/

		/*
		char c = 'a';
		switch(c){
		
		}
		*/

		//switchҲ֧���ַ���String���͡�
		//switch("abc"){}

		// дһ��������switch���
		// ���ռ������룬����������������ж����ڼ���
		// 0 ������
		// 1 ����һ
		// ....
		// ������������־�����ȷ�ġ�0��6
		java.util.Scanner s = new java.util.Scanner(System.in);
		System.out.print("������[0-6]��������");
		int num = s.nextInt();

		/*
		switch(num){
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
		}
		*/

		//case��͸����
		/*
		switch(num){
		case 0:
			System.out.println("������");
			break;
		case 1:
			System.out.println("����һ");
		case 2:
			System.out.println("���ڶ�");
		case 3:
			System.out.println("������");
		case 4:
			System.out.println("������");
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
		}
		*/

		// ����default��䣬�����е�case��û��ƥ���ϵ�ʱ��ִ��default��䡣
		/*
		switch(num){
		case 1:
			System.out.println("����һ");
			break;
		case 2:
			System.out.println("���ڶ�");
			break;
		case 3:
			System.out.println("������");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		default:
			System.out.println("������");
		}
		*/

		// ����case�ϲ�������
		switch(num){
		case 1: case 2: case 3:
			System.out.println("����һ");
			break;
		case 4:
			System.out.println("���ڶ�");
			break;
		case 5:
			System.out.println("������");
			break;
		case 6:
			System.out.println("������");
			break;
		case 7:
			System.out.println("������");
			break;
		case 8:
			System.out.println("������");
			break;
		default:
			System.out.println("������");
		}


	}
}