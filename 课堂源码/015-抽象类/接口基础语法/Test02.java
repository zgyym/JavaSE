
/*
	�ӿڵĻ����﷨��
		1�������֮������̳У���ͽӿ�֮�����ʵ�֡�
		����룺����Ȼ���Խ�"ʵ��"�������̳С���
		�̳�ʹ��extends�ؼ�����ɡ�
		ʵ��ʹ��implements�ؼ�����ɡ�

		2������ǣ�*****������һ���ǳ������ʵ�ֽӿڵĻ������뽫�ӿ������е�
		���󷽷�ȫ��ʵ�֣����ǡ���д����
*/
public class Test02{
	public static void main(String[] args){
		//����: MyMath�ǳ����; �޷�ʵ����
		//new MyMath();

		// ��ʹ�ö�̬�𣿿��ԡ�
		//Animal a = new Cat();

		// �����͵�����ָ�������͵Ķ���
		MyMath mm = new MyMathImpl();
		// ���ýӿ�����ķ���������ӿڱ�̡���
		int result1 = mm.sum(10, 20);
		System.out.println(result1);

		int result2 = mm.sub(20, 10);
		System.out.println(result2);
	}
}

// ����ĳ����࣬��ȫ����ģ������ӿڡ�
interface MyMath{
	double PI = 3.1415926;
	int sum(int a, int b);
	int sub(int a, int b);
}

// ����û����
/*
abstract class MyMathImpl implements MyMath {
}
*/

// ��дһ���ࣨ�������һ�����ǳ��󡱵��ࣩ
// ����������������ġ�
//����: MyMathImpl���ǳ����, ����δ����MyMath�еĳ��󷽷�sub(int,int)
/*
class MyMathImpl implements MyMath {
}
*/

//����
class MyMathImpl implements MyMath {

	//�������ڳ��Է�����͵ķ���Ȩ��; ��ǰΪpublic
	/*
	int sum(int a, int b){
		return a + b;
	}
	*/

	// ��д/����/ʵ�� �ӿ��еķ�����ͨ������ʵ�֡���
	public int sum(int a, int b){
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}
}