
/*
	��ϵ�������
		>
		>=
		<
		<=
		==
		!=

		һ��Ҫ��סһ������
			���еĹ�ϵ����������������ǲ������ͣ�
			����true����false��������������ֵ��
		
		��java������:
			= �� ��ֵ�����
			== ����ϵ��������ж��Ƿ���ȡ�
		
		ע�⣺��ϵ�������������������ŵĻ�����������֮�䲻���пո�
			>= ���ǶԵ�, > = ���ǲ��Եġ�
			== ���ǶԵģ�= = ���ǲ��Եġ�
*/
public class OperatorTest02{
	public static void main(String[] args){
		int a = 10;
		int b = 10;
		System.out.println(a > b); // false
		System.out.println(a >= b); // true
		System.out.println(a < b); // false
		System.out.println(a <= b); // true
		System.out.println(a == b); // true
		System.out.println(a != b); // false
	}
}