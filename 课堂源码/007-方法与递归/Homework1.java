public class Homework1{
	public static void main(String[] args){
		/*
		// ����5�Ľ׳�
		int n = 5;
		int result = 1;
		for(int i = n; i > 1; i--){
			//System.out.println(i);
			//result = result * i;
			result *= i;
		}
		System.out.println(result);
		*/

		// ���÷�������׳�
		int retValue1 = jieCheng(5);
		System.out.println(retValue1); // 120

		int retValue2 = jieCheng(6);
		System.out.println(retValue2); // 720
	}

	// ��ȡһ�������������������ר��������ĳ�����Ľ׳�
	// �������һ����5��������������ֵ��������6��Ҳ������7����ȷ��
	// �����ֲ�ȷ�������ݣ����ڷ�����˵���ǾͿ��Զ���Ϊ���βΡ����β����Ͷ���Ϊint��
	// �÷�����Ϊ����ɽ׳˵ģ���������Ҫһ���������ģ����Ը÷���Ӧ���з���ֵ��
	// �����Ľ�����ظ����÷���˭�����ң��Ҿͷ��ظ�˭������ֵ���Ͷ���Ϊint
	// ������������Լ����κ����Ľ׳ˡ�
	public static int jieCheng(int n){
		int result = 1;
		for(int i = n; i > 1; i--){
			result *= i;
		}
		return result;
	}


}