
public class ForTest03{
	public static void main(String[] args){

		// for��������ʽ
		for(int i = 10; i > 0; i--){
			System.out.println("i = " + i); // 10 9 8 7 6 5 4 3 2 1
		}

		// ����
		for(int i = 0; i < 10; i += 2){
			System.out.println("value1 = " + i); // 0 2 4 6 8 
		}

		//ע�⣺1��3�������������1
		/*
		for(int i = 100; i > 0; i %= 3){
			System.out.println("value2 = " + i); // 100 1 1... 1
		}
		*/
	}
}

