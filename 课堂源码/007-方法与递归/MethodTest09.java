public class MethodTest09{
	public static void main(String[] args){
		//����sum����
		int jieGuo = sum(10, 20);
		System.out.println(jieGuo); // 30

		// �������д����ܷ�ϲ�Ϊһ�У�
		// ����
		System.out.println(sum(100, 200)); // 300

		System.out.println(m()); // true

		
		boolean flag = m();
		if(flag){
			System.out.println("��ġ���������");
		}

		if(m()){
			System.out.println("��ġ���������");
		}
	}

	public static boolean m(){
		return true;
	}


	// ��͵ķ���
	public static int sum(int a, int b){
		return a + b;
	}
}

