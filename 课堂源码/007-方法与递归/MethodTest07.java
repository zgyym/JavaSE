
// ��ҷ������´��룬�������ᱨ����
public class MethodTest07{

	public static void main(String[] args){
		// ���÷���
		int result = m();
		System.out.println(result); // 1

		// ����x����
		int result1 = x(true);
		System.out.println("result1 = " + result1);

		// �ٴε���x����
		int result2 = x(false);
		System.out.println("result2 = " + result2);
	}

	
	//����: ȱ�ٷ������
	/*
	public static int m(){
		boolean flag = true; //���������������г��򣬱�����ֻ������
		// ���ڱ�������˵��������ֻ֪��flag������boolean����
		// ����������Ϊflag�п�����false���п�����true
		if(flag){
			// ���������ã��������д�����ܻ�ִ�У���ȻҲ���ܲ���ִ��
			// ������Ϊ��ȷ�����򲻳����κ��쳣�����Ա�����˵��ȱ�ٷ������
			return 1;
		}
	}
	*/

	// ��ô�޸���������أ�
	// ��һ�ַ���������else��֧�Ŀ��Ա�֤һ������һ����ִ֧�С�
	/*
	public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
		}else{
			return 0;
		}
	}
	*/

	// �ڶ��ַ������÷���ʵ�����Ƿ���1�ı��Ρ�
	// return���һ��ִ�У����ڵķ����ͻ������
	/*
	public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
		}
		return 0;
	}
	*/

	/*
	// ��ͬһ�����У�"return���"���治���ٱ�д�������롣��д֮����뱨��
	public static int m(){
		boolean flag = true;
		if(flag){
			return 1;
			//����: �޷����ʵ����
			//System.out.println("hello1");
		}
		// ���д��������Ĵ���hello1�������ǣ�����ͬһ�����С�
		//System.out.println("hello2");
		return 0;
		// ����: �޷����ʵ����
		//System.out.println("hello3");
	}
	*/

	// ��Ŀ������е�ʱ����ô���ܼ�����
	public static int m(){
		boolean flag = true;
		return flag ? 1 : 0;
	}

	// ����һ�������ķ�����
	public static int x(boolean flag){
		return flag ? 1 : 0;
	}




}