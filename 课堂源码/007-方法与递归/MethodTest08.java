
// �ֲ�������ֻ�ڷ���������Ч����������֮�󣬾ֲ��������ڴ���ͷ��ˡ�
// JVM������Ҫ���ڴ棺ջ�ڴ桢���ڴ桢�������ڴ档
// ���������������ݣ��������зŴ���Ƭ�Ρ����class�ֽ��롣
// ���ڴ棺���潲��
// ջ�ڴ棺�������õ�ʱ�򣬸÷�����Ҫ���ڴ�ռ���ջ�з��䡣
// �����������ǲ�����ջ�з���ռ�ġ�

// ����ֻ���ڵ��õ�ʱ��Ż���ջ�з���ռ䣬���ҵ���ʱ����ѹջ��
// ����ִ�н���֮�󣬸÷�������Ҫ�Ŀռ�ͻ��ͷţ���ʱ������ջ������

// �������ý�����ѹջ������ռ�
// ����������������ջ���ͷſռ�

// ջ�д洢ʲô���������й�������Ҫ���ڴ棬�Լ�ջ�л�洢�����ľֲ�������

public class MethodTest08{
	//�����������
	public static void main(String[] args){
		
		//int a = 100;
		// �����ֵԭ���ǣ���a�����б����100������ָ���һ�ݴ���b������
		// ����a��b��������ͬ���ڴ�ռ䣬�������ֲ�������
		//int b = a;

		System.out.println("main begin");
		int x = 100;
		m1(x);
		System.out.println("main over");
	}
	public static void m1(int i){ // i�Ǿֲ�����
		System.out.println("m1 begin");
		m2(i);
		System.out.println("m1 over");
	}
	public static void m2(int i){
		System.out.println("m2 begin");
		m3(i);
		System.out.println("m2 over");
	
	}
	public static void m3(int i){
		System.out.println("m3 begin");
		System.out.println(i);
		System.out.println("m3 over");
	}
}