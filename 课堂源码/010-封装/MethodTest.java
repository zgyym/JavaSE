//����static�ķ���
//û��static�ķ���
//�ֱ���ô���ã�
	//����static�ķ�����ô���ã�ͨ��������.���ķ�ʽ���ʡ�

//���󱻳�Ϊʵ����
//ʵ����ص��У�ʵ��������ʵ��������
//ʵ�������Ƕ��������ʵ�������Ƕ��󷽷���
//ʵ����صĶ���Ҫ��new����ͨ��������.���ķ�ʽȥ���ʡ�
public class MethodTest{

	/*
	public MethodTest(){
	
	}
	*/

	public static void main(String[] args){
		MethodTest.doSome();
		//����. ����ʡ�ԣ���ͬһ�����С���
		doSome();
		// ����ʹ�á�����.���ķ�ʽ���ʡ�ʵ��������
		// �����
		//MethodTest.doOther();
		
		// ��������
		MethodTest mt = new MethodTest();
		// ͨ��"����."�ķ�ʽ����ʵ��������
		mt.doOther();

	}	

	// ����static
	public static void doSome(){
		System.out.println("do some!");
	}

	//�������û��static�������ķ�������Ϊ��ʵ�������������󷽷������󼶱�ķ�����
	//���û�����ͣ����Ŀǰ����Ӳ����
	public void doOther(){
		System.out.println("do other....");
	}

}