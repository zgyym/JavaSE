
// ʹ�õݹ飬���д���򣬼���1~n�ĺ͡�
public class RecursionTest03{
	public static void main(String[] args){
		// 1~3�ĺ�
		int n = 3;
		int r = sum(n);
		System.out.println(r); // 6
	}

	// ���Ŭ����ȥ����ȥ�����Լ�д������û��ϵ���ؼ����ܲ��ܿ�����
	// ������дһ������1~n�͵ķ���
	// ��������޸�Ϊ�ݹ�ķ�ʽ��
	// 3 + 2 + 1
	public static int sum(int n){
		//n�������3
		// 3 + 2 (2����ô�ĳ����ģ�n - 1)
		//sum(n - 1); 
		if(n == 1){
			return 1;
		}
		// ������ִ�е��˴�˵��n����1
		return n + sum(n-1);
	}
}