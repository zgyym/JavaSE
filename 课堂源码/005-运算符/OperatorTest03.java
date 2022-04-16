
/*
	�߼��������
		&	�߼��루���Է���ɲ��ң�
		|	�߼��򣨿��Է���ɻ��ߣ�
		!	�߼��ǣ�ȡ����
		&&	��·��
		||	��·��
	
	����ͨ�������Ļ���100 ���� 99 ���� 100 ���� 98 ���е���
	�ô��������Ļ���100 > 99 & 100 > 98 --> true

	true & true --> true

	�ǳ���Ҫ��
		�߼����������Ҫ���ǲ������ͣ��������յ�������Ҳ�ǲ������͡�
		�����߼���������ص㡣
	
	100 & true ���У��﷨����
	100 & 200 ���У�û�������﷨��
	true & false �������ԡ�

	100 > 90 & 100 > 101 --> false

	& ���߶���true���������true
	| ��һ����true���������true

*/	
public class OperatorTest03{
	public static void main(String[] args){
		// �����߼���&�������˵��ֻҪ��һ����false���������false��
		// ֻ������ͬʱΪtrue���������true��
		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & false); // false

		System.out.println(100 > 90 & 100 > 101); // false
		System.out.println((100 > 90) & (100 > 101)); // false

		int a = 100;
		int b = 101;
		int c = 90;
		System.out.println(a < b & a > c); // true

		// �����߼����أ�
		// ֻҪ��һ����true���������true��
		System.out.println(a < b | c > b); // true
		System.out.println(true | false); // true

		System.out.println(true | true); // true
		System.out.println(false | false); // false

		System.out.println(!false); // true
		System.out.println(!true); // false

		// ע�⣺������Ҫ��һ��С���š�
		System.out.println(!(a > b)); // true

		/*
			���ڶ�·�� &&����·�� ||
			�����ص�ѧϰ��·�룬��·���պ�«��ư��

			��·��&& �� �߼��� &��ʲô����
				�����������������������û���κ�������ȫ��ͬ��
				ֻ��������·��&&���ᷢ����·����

			ʲô�Ƕ�·�����أ�
				�ұ߱��ʽ��ִ�У��������������·����

			ʲôʱ��ʹ��&&��ʲôʱ��ʹ��& ��
				��Ч�ʷ�����˵��&&��&��Ч�ʸ�һЩ��
				��Ϊ�߼���&���ܵ�һ�����ʽ�����ʲô���ڶ������ʽһ����ִ�С�

				�Ժ�Ŀ����У���·��&&���߼��뻹����Ҫͬʱ����ġ�
					�󲿷�����¶�����ʹ�ö�·��&&
					ֻ�е�����Ҫ��߱��ʽִ�У�����Ҫ�ұ߱��ʽִ�е�ʱ�򣬲Ż�
					ѡ���߼���&��
		*/

		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & false); // false

		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && false); // false

		// ��������Ҫ���һ��ʲô�Ƕ�·����ʲôʱ��ᷢ������·����
		int x = 10;
		int y = 11;
		// �߼���&ʲôʱ����Ϊtrue�����߶���true���������true��
		// ��ߵ� x>y ���ʽ����Ѿ���false�ˣ���ʵ�������ʽ�Ľ�
		// ���Ѿ�ȷ����false�ˣ���������˵�ұߵı��ʽ��Ӧ��ִ�С�
		System.out.println(x > y & x > y++); 

		// ͨ��������Եó���x > y++ ������ʽִ���ˡ�
		System.out.println(y); // 12

		//���Զ�·��&&
		int m = 10;
		int n = 11;
		// ʹ�ö�·��&&��ʱ�򣬵���ߵı��ʽΪfalse��ʱ���ұߵı��ʽ��ִ��
		// �������󱻳�Ϊ��·��
		System.out.println(m > n && m > n++);
		System.out.println(n); // 11

		// ���⣺ʲôʱ������·������
		// || ��·��
		// ���򡱵�ʱ��ֻҪ��һ����true���������true��
		// ���ԣ�����ߵı��ʽ�����true��ʱ���ұߵı��ʽ����Ҫִ�У���ʱ���·��

	}
}