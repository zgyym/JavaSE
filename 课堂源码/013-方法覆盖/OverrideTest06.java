
// �������ԣ����ס���С�
// ˽�з������ܸ��ǡ�
public class OverrideTest06{

	// ˽�з���
	private void doSome(){
		System.out.println("OverrideTest06's private method doSome execute!");
	}

	// ���
	public static void main(String[] args){
		// ��̬
		OverrideTest06 ot = new T();
		ot.doSome(); //OverrideTest06's private method doSome execute!
	}
}

/*
// ���ⲿ�����޷�����˽�еġ�
class MyMain{
	public static void main(String[] args){
		OverrideTest06 ot = new T();
		//����: doSome() �� OverrideTest06 ���� private ���ʿ���
		//ot.doSome();
	}
}
*/

// ����
class T extends OverrideTest06{
	// ������д�����е�doSome()����
	// ����Ȩ�޲��ܸ��ͣ����Ը��ߡ�
	public void doSome(){
		System.out.println("T's public doSome method execute!");
	}
}