// �����������������
// java�й涨���������ݵ�ʱ�򣬺������޹أ������ǻ����������ͻ���������������
// ͳһ���ǽ������б�����Ǹ���ֵ������һ�ݣ�������ȥ��

// java��ֻ��һ���涨���������ݵ�ʱ��һ���ǽ������ӡ��еĶ�������һ�ݴ��ݹ�ȥ��

// �ڴ��ַҲ��ֵ��Ҳ�Ǻ����б����һ��������
public class Test1{
	public static void main(String[] args){

		int x = 100;
		int y = x; // x��ֵ��y������ô���ݵģ���x�����б����100���ֵ����һ�ݴ���y

		// �ֲ�����������main
		int i = 10;
		// ��i�����б����10����һ�ݣ�����add������
		add(i); 
		System.out.println("main ---> " + i); //10
	}

	/*
	public static void add(int i){ // i�Ǿֲ�����������add
		i++;
		System.out.println("add ----> " + i); //11
	}
	*/

	public static void add(int k){ 
		k++;
		System.out.println("add ----> " + k); 
	}
}
