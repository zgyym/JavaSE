/*
	�����ݹ飿
		1��ʲô�Ƿ����ݹ飿
			�����Լ������Լ�������Ƿ����ݹ顣

		2�����ݹ�ʱ����û�н���������һ���ᷢ����
			ջ�ڴ��������StackOverflowError
			���ԣ��ݹ����Ҫ�н���������������һ���ǳ���Ҫ��֪ʶ�㡣��

			JVM��������֮��ֻ��һ������������˳�JVM��

		3���ݹ�������н��������ģ���һ�����ᷢ��ջ�ڴ����������
			����������������ǶԵģ��ǺϷ��ģ��ݹ��е�ʱ��Ҳ�����ջ�ڴ��������
			��Ϊ�п��ܵݹ��̫�ջ�ڴ治���ˡ���Ϊһֱ��ѹջ��
		
		4����ʵ�ʵĿ����У����������׵�ѡ��ݹ飬����forѭ��whileѭ������ģ�����
		ʹ��ѭ����������Ϊѭ����Ч�ʸߣ��ķѵ��ڴ��١��ݹ�ķѵ��ڴ�Ƚϴ�����
		�ݹ��ʹ�ò������ᵼ��JVM������
		(���ڼ�����������£����õݹ飬�������û��ʵ�֡�)
		���ԣ��ݹ����ǻ���Ҫ����ѧϰ�ġ�

		5����ʵ�ʵĿ����У�������һ���������������ˣ�StackOverflowError
		����ô���������⣬����̸һ�����˼·��
			����̸һ���ҵĸ���˼·��
				���ȵ�һ����
					�ȼ��ݹ�Ľ��������Բ��ԡ�����ݹ�����������ԣ�
					�����������һ���޸ģ�ֱ����ȷΪֹ��

				�ڶ���������ݹ�����û���⣬��ô�죿
					���ʱ����Ҫ�ֶ��ĵ���JVM��ջ�ڴ��ʼ����С��
					���Խ�ջ�ڴ�Ŀռ����㡣�����Ե�����һЩ����
				
				�������������˴�С���������ʱ���ǳ����������
				û�취��ֻ�ܼ�������ջ���ڴ��С��
				
				(java -X)������Բ鿴������ջ��С�Ĳ���
*/
public class RecursionTest01{
	// ���
	public static void main(String[] args){
		doSome();
	}

	public static void doSome(){
		System.out.println("doSome begin");
		// ���÷�����doSome()��Ȼ��һ����������ôdoSome�������Ե����𣿵�Ȼ���ԡ�
		// Ŀǰ����ݹ���û�н��������ģ������ʲô���⣿
		doSome();
		// ���д�����Զִ�в�����
		System.out.println("doSome over");
	}

	/*
	public static void doSome(){
		System.out.println("doSome begin");
		// ���÷�����doSome()��Ȼ��һ����������ôdoSome�������Ե����𣿵�Ȼ���ԡ�
		doSome();
		// ���д�����Զִ�в�����
		System.out.println("doSome over");
	}

	public static void doSome(){
		System.out.println("doSome begin");
		// ���÷�����doSome()��Ȼ��һ����������ôdoSome�������Ե����𣿵�Ȼ���ԡ�
		doSome();
		// ���д�����Զִ�в�����
		System.out.println("doSome over");
	}

	public static void doSome(){
		System.out.println("doSome begin");
		// ���÷�����doSome()��Ȼ��һ����������ôdoSome�������Ե����𣿵�Ȼ���ԡ�
		doSome();
		// ���д�����Զִ�в�����
		System.out.println("doSome over");
	}

	public static void doSome(){
		System.out.println("doSome begin");
		// ���÷�����doSome()��Ȼ��һ����������ôdoSome�������Ե����𣿵�Ȼ���ԡ�
		doSome();
		// ���д�����Զִ�в�����
		System.out.println("doSome over");
	}

	public static void doSome(){
		System.out.println("doSome begin");
		// ���÷�����doSome()��Ȼ��һ����������ôdoSome�������Ե����𣿵�Ȼ���ԡ�
		doSome();
		// ���д�����Զִ�в�����
		System.out.println("doSome over");
	}

	public static void doSome(){
		System.out.println("doSome begin");
		// ���÷�����doSome()��Ȼ��һ����������ôdoSome�������Ե����𣿵�Ȼ���ԡ�
		doSome();
		// ���д�����Զִ�в�����
		System.out.println("doSome over");
	}

	public static void doSome(){
		// ����ͻȻ��һ�죬һ�����������ˣ����doSome������
		if(ĳ������������){
			return;
		}
	}
	*/
}