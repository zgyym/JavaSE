/*
	ʲôʱ���������Ϊʵ���ģ�ʲôʱ������Ϊ��̬�ģ�
		���������͵����ж����ĳ������ֵ����һ���ģ�
		�����鶨��Ϊʵ���������˷��ڴ�ռ䡣���鶨��
		Ϊ�༶������������Ϊ��̬�������ڷ�������ֻ����
		һ�ݣ���ʡ�ڴ濪����
	
	һ������һ�ݵ���ʵ��������
	���ж���һ�ݵ��Ǿ�̬������
*/
/*
public class StaticTest02{
	public static void main(String[] args){
		Chinese c1 = new Chinese("1231456456456456","����","�й�");
		System.out.println(c1.idCard);
		System.out.println(c1.name);
		System.out.println(c1.country);

		Chinese c2 = new Chinese("7897897896748564","����","�й�");
		System.out.println(c2.idCard);
		System.out.println(c2.name);
		System.out.println(c2.country);
	}
}

// ����һ���ࣺ�й���
class Chinese{

	// ���֤��
	// ÿһ���˵����֤�Ų�ͬ���������֤��Ӧ����ʵ��������һ������һ�ݡ�
	String idCard; 

	// ����
	// ����Ҳ��һ����һ������������ҲӦ����ʵ��������
	String name;

	// ����
	// ���ڡ��й��ˡ��������˵���������ǡ��й������������Ŷ���ĸı���ı䡣
	// ��Ȼ���������Ƕ��󼶱��������
	// ����������������������������������
	// ��������Ϊʵ���������ڴ�ͼ�������ģ�
	// ��������Ϊ��̬�������ڴ�ͼ����������?
	String country;

	// �޲���
	public Chinese(){
	
	}

	// �в���
	public Chinese(String s1,String s2, String s3){
		idCard = s1;
		name = s2;
		country = s3;
	}
}
*/

public class StaticTest02{
	public static void main(String[] args){
		// �����й��˵Ĺ���
		// ��̬����Ӧ��ʹ������.�ķ�ʽ����
		System.out.println(Chinese.country);

		Chinese c1 = new Chinese("1231456456456456","����");
		System.out.println(c1.idCard);
		System.out.println(c1.name);

		Chinese c2 = new Chinese("7897897896748564","����");
		System.out.println(c2.idCard);
		System.out.println(c2.name);

		// idCard��ʵ��������������new����ͨ��������.�� ����
		// ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� idCard
		//System.out.println(Chinese.idCard);
	}
}

// ����һ���ࣺ�й���
class Chinese{

	// ���֤��
	// ÿһ���˵����֤�Ų�ͬ���������֤��Ӧ����ʵ��������һ������һ�ݡ�
	String idCard; 

	// ����
	// ����Ҳ��һ����һ������������ҲӦ����ʵ��������
	String name;

	// ����
	// �ص��ص�����ǣ���static�ı���������̬����
	// ��̬�����������ʱ��ʼ��������Ҫnew���󣬾�̬�����Ŀռ�Ϳ������ˡ�
	// ��̬�����洢�ڷ�������
	static String country = "�й�";

	// �޲���
	public Chinese(){
	
	}

	// �в���
	public Chinese(String s1,String s2){
		idCard = s1;
		name = s2;
	}
}