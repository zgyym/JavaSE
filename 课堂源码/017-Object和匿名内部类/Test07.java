/*
	hashCode������
		��Object�е�hashCode�����������ģ�
			public native int hashCode();

			����������ǳ��󷽷�������native�ؼ��֣��ײ����C++����
		
		hashCode()�������ص��ǹ�ϣ�룺
			ʵ���Ͼ���һ��java������ڴ��ַ��������ϣ�㷨���ó���һ��ֵ��
			����hashCode()������ִ�н�����Ե�ͬ����һ��java������ڴ��ַ��
*/
public class Test07{
	public static void main(String[] args){
		Object o = new Object();
		int hashCodeValue = o.hashCode();

		// �����ڴ��ַ������ϣ�㷨ת����һ�����֡����Ե�ͬ�����ڴ��ַ��
		System.out.println(hashCodeValue); //798154996

		MyClass mc = new MyClass();
		int hashCodeValue2 = mc.hashCode();
		System.out.println(hashCodeValue2); //1392838282

		MyClass mc2 = new MyClass();
		System.out.println(mc2.hashCode()); // 523429237
	}
}

class MyClass
{
}