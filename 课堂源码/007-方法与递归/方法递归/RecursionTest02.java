
// �Ȳ�ʹ�õݹ飬���д���򣬼���1~n�ĺ͡�
public class RecursionTest02{
	public static void main(String[] args){
		// 1~10�ĺ�
		int retValue1 = sum(10);
		System.out.println(retValue1);

		// 1~3�ĺ�
		int retValue2 = sum(3);
		System.out.println(retValue2); // 6 (1 + 2 + 3)
	}

	// ������дһ������1~n�͵ķ���
	public static int sum(int n){
		int result = 0;
		for(int i = 1; i <= n; i++){
			result += i;
		}
		return result;
	}
}