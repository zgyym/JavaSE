
/*
	�ڷ������õ�ʱ��ʲôʱ������.���ǿ���ʡ�Եġ�ʲôʱ����ʡ�ԣ�
		a()��������b()������ʱ��a��b��������ͬһ�����У�������.������
		ʡ�ԡ��������ͬһ�����С�����.������ʡ�ԡ�
*/

// ��1
public class MethodTest04{

	public static void daYin3(){
		System.out.println("�����ڵ�-�ڿ��ഫ��Java���Ҿ�У��");
	}
	
	// ���
	public static void main(String[] args){
		// ����println()������
		MethodTest04.daYin();
		MethodTest04.daYin2();
		MethodTest04.daYin3();

		// ������. ������ʡ����
		daYin();
		daYin2();
		daYin3();

		// ��һ�ο�����á�
		// ����������£�������.���Ͳ���ʡ���ˡ�
		MyClass.daYin();
		//daYin();
	}

	public static void daYin(){
		System.out.println("hello world!");
	}

	public static void daYin2(){
		System.out.println("hello world2!!!");
	}
}

// ��2
class MyClass{

	public static void daYin(){
		System.out.println("��ӡ1");
	}

	public static void daYin2(){
		System.out.println("��ӡ2");
	}

	public static void daYin3(){
		System.out.println("��ӡ3");
	}
}