/*
	�����ڲ��ࣺ

		1��ʲô���ڲ��ࣿ
			�ڲ��ࣺ������ڲ��ֶ�����һ���µ��ࡣ����Ϊ�ڲ��ࡣ

		2���ڲ���ķ��ࣺ
			��̬�ڲ��ࣺ�����ھ�̬����
			ʵ���ڲ��ࣺ������ʵ������
			�ֲ��ڲ��ࣺ�����ھֲ�����

		3��ʹ���ڲ����д�Ĵ��룬�ɶ��Ժܲ�ܲ��þ������á�

		4�������ڲ����Ǿֲ��ڲ����һ�֡�
			��Ϊ�����û�����ֶ����������������ڲ��ࡣ
		
		5��ѧϰ�����ڲ�����Ҫ���ô���Ժ����Ķ����˴����ʱ���ܹ���⡣
		���������Ժ�Ҫ����д����Ϊ�����ڲ���������ȱ�㣺
			ȱ��1��̫���ӣ�̫�ң��ɶ��Բ
			ȱ��2����û�����֣��Ժ����ظ�ʹ�ã������á�
		
		6����������ˣ���ֻҪ��ס����д�����С�
*/

class Test01{

	// ��̬����
	static String country;
	// ����������ڲ������Գ�Ϊ�ڲ���
	// ����ǰ����static�����Գ�Ϊ����̬�ڲ��ࡱ
	static class Inner1{
	}
	
	// ʵ������
	int age;
	// ����������ڲ������Գ�Ϊ�ڲ���
	// û��static����ʵ���ڲ��ࡣ
	class Inner2{
	}

	// ����
	public void doSome(){
		// �ֲ�����
		int i = 100;
		// ����������ڲ������Գ�Ϊ�ڲ���
		// �ֲ��ڲ��ࡣ
		class Inner3{
		}
	}

	public void doOther(){
		// doSome()�����еľֲ��ڲ���Inner3����doOther()�в����á�
	}

	// main���������
	public static void main(String[] args){
		// ����MyMath�е�mySum������
		MyMath mm = new MyMath();
		/*
		Compute c = new ComputeImpl();
		mm.mySum(c, 100, 200);
		*/
		
		//�ϲ�������д���룬��ʾ����������еġ������ǣ�ComputeImpl��
		//mm.mySum(new ComputeImpl(), 100, 200);
	
		// ʹ�������ڲ��࣬��ʾ���ComputeImpl�����û�����ˡ�
		// ������濴��ȥ�����ǽӿڿ���ֱ��new�ˣ�ʵ���ϲ����ǽӿڿ���new�ˡ�
		// �����{} �����˶Խӿڵ�ʵ�֡�
		// ������ʹ�������ڲ��࣬Ϊʲô��
		// ��Ϊһ����û�����֣�û�а취�ظ�ʹ�á��������̫�ң��ɶ���̫�
		mm.mySum(new Compute(){
			public int sum(int a, int b){
				return a + b;
			}
		}, 200, 300);



	}

}

// �������Ľӿ�
interface Compute{ 
	
	// ���󷽷�
	int sum(int a, int b);
}

// ���Զ����������дһ��Compute�ӿڵ�ʵ����
/*
class ComputeImpl implements Compute{

	// �Է�����ʵ��
	public int sum(int a, int b){
		return a + b;
	}
}
*/

// ��ѧ��
class MyMath{
	// ��ѧ��ͷ���
	public void mySum(Compute c, int x, int y){
		int retValue = c.sum(x, y);
		System.out.println(x + "+" + y + "=" + retValue);
	}	
}
