/*
	�����������
		+	���
		-	���
		*  �˻�
		/  ��
		%  ����������ģ��

		++ �Լ�1
		-- �Լ�1
	
	����++�������˵��
		���Գ����ڱ���ǰ��Ҳ���Գ����ڱ�����
		���ܳ����ڱ���ǰ���Ǻ���֮++ִ�н���֮�󣬱�����ֵһ�����Լ�1��
	
*/
public class OperatorTest01{
	public static void main(String[] rags){
		int a = 10;
		int b = 3;
		System.out.println(a + b); // 13
		System.out.println(a - b); // 7
		System.out.println(a * b); // 30
		System.out.println(a / b); // 3
		System.out.println(a % b); // 1

		// �ص����� ++ �� --
		// �����ص㽲�� ++������-- ��ҿ����պ�«��ư��
		// ++ �Լ�1��++���Գ����ڱ���ǰ��Ҳ���Գ����ڱ����󡣣�
		int i = 10;

		// i�����Լ�1
		i++;

		System.out.println(i); //11

		int k = 10;
		// k�����Լ�1
		++k;
		System.out.println(k); //11

		// �о���++�����ڱ���ǰ�ͱ�������ʲô����
		// �ȿ�++�����ڱ�����
		// �﷨����++�����ڱ����󣬻�������ֵ���㣬���Լ�1���ڱȽϴ�С,����ʱҲһ����
		int m = 20;
		int n = m++;
		System.out.println(n); // 20
		System.out.println(m); // 21

		// ++�����ڱ���ǰ�أ�
		// �﷨���򣺵�++�����ڱ���ǰ��ʱ�򣬻��Ƚ����Լ�1�����㣬Ȼ���ٸ�ֵ�����ڱȽϴ�С��Ҳһ����
		int x = 100;
		int y = ++x;
		System.out.println(x); // 101
		System.out.println(y); // 101

		// ��Ŀ
		int c = 90;
		System.out.println(c++);  // ���������������������һ�����εĸ�ֵ���㡣90
		// ����������⿪
		//int temp = c++;
		//System.out.println(temp);

		System.out.println(c); // 91

		int d = 80;
		System.out.println(++d); //81
		// ���
		//int temp2 = ++d;
		//System.out.println(temp2);

		System.out.println(d); // 81

		/*
		int e = 1;
		int f = e; // e��ֵ��f����ʾ��e����������f
		*/

		// �Լ��������� -- �������

	}
}