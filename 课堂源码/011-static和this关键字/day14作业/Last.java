/*
�����ɷ��� Husband �������� Wife��
�ɷ�������԰��������֤�ţ��������������ڣ����ӡ�
����������԰��������֤�ţ��������������ڣ��ɷ�
�ֱ�����������ṩ���췽�����޲������췽�����в������췽����Ҫ�ṩ����
��д���Գ��򣬴����ɷ����Ȼ���ٴ������Ӷ����ɷ����������Ӷ���
���Ӷ�������ɷ����Ҫ���ܹ����������ɷ���󡱵����ӵ����֣�
�����ܹ������������Ӷ��󡱵��ɷ�����֡�Ҫ���ܹ���������ִ�й��̵��ڴ�ͼ��
����Ҫ���ڳ�������ʾ����ָ���쳣��Ч����

���£�
	.����ֻ��һ�����ʣ�û��С���ţ���ʾ���ʵ������ԡ�
	.������һ�����ʣ����ʺ�����С���ţ���ʾ���ʵ��Ƿ�����

���һ��Ҫ�����ڴ�ͼ�������о���ֵ��
*/
public class Last{
	public static void main(String[] args){
		// �����ɷ�����ɷ�û�����ӣ�
		//Husband h = new Husband("1111111", "����", "1999-10-11", null);
		Husband h = new Husband("1111111", "����", "1999-10-11");

		// �������Ӷ������ӻ�û���ɷ�
		//Wife w = new Wife("222222", "����", "1989-11-10", null);
		Wife w = new Wife("222222", "����", "1989-11-10");

		// ��������飨������ϵ��
		h.wife = w;
		w.husband = h;

		// ����ɷ�������������
		//System.out.println(h.name + "��������" + w.name); //����д����ġ�
		//��û�н���ʱ�򣬳��֣�java.lang.NullPointerException
		System.out.println(h.name + "��������" + h.wife.name);
		System.out.println(w.name + "���ɷ���" + w.husband.name);

	}
}

// �ɷ���
class Husband{
	// ���֤��
	String idCard;
	// ����
	String name;
	// ����
	String birth;
	// ����
	Wife wife; //ʵ������

	// �޲������췽��
	public Husband(){
	
	}

	// �в����Ĺ��췽��
	public Husband(String s1,String s2,String s3){
		idCard = s1;
		name = s2;
		birth = s3;
	}


	// �в����Ĺ��췽��
	public Husband(String s1,String s2,String s3, Wife w){
		idCard = s1;
		name = s2;
		birth = s3;
		wife = w;
	}

}

// ������
class Wife{
	// ���֤��
	String idCard;
	// ����
	String name;
	// ����
	String birth;
	// �ɷ�
	Husband husband;

	// �޲����Ĺ��췽��
	public Wife(){
	
	}

	// �в����Ĺ��췽��
	public Wife(String s1,String s2,String s3){
		idCard = s1;
		name = s2;
		birth = s3;
	}

	// �в������췽��
	public Wife(String s1,String s2,String s3,Husband h){
		idCard = s1;
		name = s2;
		birth = s3;
		husband = h;
	}
}