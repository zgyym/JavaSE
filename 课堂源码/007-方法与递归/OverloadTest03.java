/*
	�������أ�overload��:

		ʲôʱ����Ҫ����ʹ�÷������أ�
			��ͬһ���൱�У����������1���͡�����2�����ǵĹ��������Ƶģ�
			��ô���Կ��ǽ����ǵķ�����һ�£�������������ۣ��ֱ���
			���ڵĴ����д�����׼��䣬����ʹ�ã���

			ע�⣺��������overload�������ʹ�ã������������ѹ������ɣ�
			�����ƣ�����û��ϵ����ʱ��������ʹ�����ػ��ƵĻ����ᵼ��
			������鷳���޷����з������ܵ����֡�

		ʲôʱ�����ᷢ���������أ�	 
			����1����ͬһ���൱��
			����2����������ͬ
			����3�������б�ͬ
						�����ĸ�����ͬ�㲻ͬ
						���������Ͳ�ͬ�㲻ͬ
						������˳��ͬ�㲻ͬ

			ֻҪͬʱ��������3����������ô���ǿ����϶������ͷ���֮�䷢����
			���ػ��ơ�
	
	ע�⣺
		���ܴ�����ôд������һ������java�������ܺõ����ֿ�������������

		�������غͷ����ġ�����ֵ���͡��޹ء�
		�������غͷ����ġ����η��б��޹ء�
*/
public class OverloadTest03{
	public static void main(String[] args){
		m1();
		m1(100);

		m2(10, 3.14);
		m2(3.14, 10);

		m3(100);
		m3(3.14);

	}

	public static void m1(){
		System.out.println("m1�޲�����ִ�У�");
	}
	
	// ��������Ĳ�������������ķ����Ĳ���������ͬ��
	public static void m1(int a){
		System.out.println("m1��һ��int����ִ�У�");
	}

	public static void m2(int x, double y){
		System.out.println("m2(int x, double y)");
	}

	// ������˳��ͬ��Ҳ�㲻ͬ��
	public static void m2(double y, int x){
		System.out.println("m2(double y, int x)");	
	}

	public static void m3(int x){
		System.out.println("m3(int x)");
	}

	// ���������Ͳ�ͬ��
	public static void m3(double d){
		System.out.println("m3(double d)");
	}

	//��������������������û�з������أ�
	// �����������ˣ��������أ������ظ��ˣ��Ǻǡ�
	/*
	public static void m4(int a, int b){
	
	}
	public static void m4(int x, int y){
	
	}
	*/

	// ������������û�з��������أ�
	// �ⲻ�����أ����Ƿ����ظ��ˡ�
	/*
	public static int m5(){
		return 1;
	}
	public static double m5(){
		return 1.0;
	}
	*/

	//������������������
	// �������û�����η��б�
	// �ⲻ�����أ����ظ��ˡ�
	/*
	void m6(){
	
	}
	// ��������η��б�
	public static void m6(){
	
	}
	*/

}

class MyClass{
	// ����ͬһ���൱�У����ܽ����������ء�
	public static void m1(int x, int y){
	
	}
}