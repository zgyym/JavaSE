/*
	
	�ൽ������ʵ�������������ǳ���

	�����ࣺ
		1��ʲô�ǳ����ࣿ
			�����֮����й�ͬ����������Щ��ͬ������ȡ�������γɵľ��ǳ����ࡣ
			�౾���ǲ����ڵģ����Գ������޷����������޷�ʵ��������

		2������������ʲô���ͣ�
			������Ҳ���������������͡�

		3����������ô���壿���ܰѻ����﷨��ѧ�ᡷ
			�﷨��
				[���η��б�] abstract class ����{
					����;
				}
		
		4�����������޷�ʵ�����ģ��޷���������ģ����Գ�����������������̳еġ�

		5��final��abstract��������ʹ�ã��������ؼ����Ƕ����ġ�

		6�����������������ǳ����ࡣҲ�����Ƿǳ����ࡣ

		7����������Ȼ�޷�ʵ���������ǳ������й��췽����������췽���ǹ�����ʹ�õġ�

		8�������������һ��������󷽷���ʲô�ǳ��󷽷��أ�
			���󷽷���ʾû��ʵ�ֵķ�����û�з�����ķ��������磺
				public abstract void doSome();
				���󷽷��ص��ǣ�
					�ص�1��û�з����壬�ԷֺŽ�β��
					�ص�2��ǰ�����η��б�����abstract�ؼ��֡�
		
		9���������в�һ���г��󷽷������󷽷���������ڳ������С����������п����зǳ��󷽷���
*/
public class AbstractTest01{ 
	public static void main(String[] args){
		// ����: Account�ǳ����; �޷�ʵ����
		//Account act = new Account();
	}
}

// �����˻���
//����: �Ƿ������η����: abstract��final
/*
final abstract class Account{

}
*/

abstract class Account{
	/*
	public Account(){
	
	}
	public Account(String s){
	
	}
	*/
	// �ǳ��󷽷�
	public void doOther(){
	
	}

	// ���󷽷�
	public abstract void withdraw();
}

// ����̳г����࣬�������ʵ��������
/*
class CreditAccount extends Account{
	public CreditAccount(){
		super();
	}
}
*/

// ���������������ǳ������𣿿���
/*
abstract class CreditAccount extends Account{

}
*/