/*
1�����˾�̬�����֮�⣬����һ�����������ʵ������
2��ʵ�������������ǲ�û��ִ�С�
3��ʵ������﷨��
	{
		java���;
		java���;
		java���;
	}
4��ʵ��������ʲôʱ��ִ�У�
	ֻҪ�ǹ��췽��ִ�У���Ȼ�ڹ��췽��ִ��֮ǰ���Զ�ִ�С�ʵ�����顱�еĴ��롣
	ʵ������Ҳ��SUN��˾Ϊjava����Ա׼��һ�������ʱ�����������󹹽�ʱ����
*/
public class InstanceCode{

	//���
	public static void main(String[] args){
		System.out.println("main begin");
		new InstanceCode();
		new InstanceCode();

		new InstanceCode("abc");
		new InstanceCode("xyz");
	}


	//ʵ������
	{
		System.out.println("ʵ������ִ�У�");	
	}

	// Constructor
	public InstanceCode(){
		System.out.println("�޲������췽��");
	}

	// Constructor
	public InstanceCode(String name){
		System.out.println("�в����Ĺ��췽��");
	}

}