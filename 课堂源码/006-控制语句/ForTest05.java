/*
1�����кϷ��ġ�������䡱������Ƕ��ʹ�á�
2��forѭ��Ƕ��һ��forѭ��ִ��ԭ����ʲô��
	��ʾһ�£���Ҳ�Ҫ��Ϊforѭ����Ƕ����һ��forѭ�����͸о�
	�������Ƚ����⣬ʵ���ϴ�ҿ�������������
		for(){
			//�ڷ������forѭ����ʱ�򣬰������for�͵���һ����ͨ��java���/����.
			for(){}
		}
*/
public class ForTest05{
	public static void main(String[] args){

		// ����forѭ��
		for(int i = 0; i < 10; i++){ 
			System.out.println("i = " + i);
		}

		for(int k = 0; k < 2; k++){ // ѭ��2��
			System.out.println("k = " + k);
		}

		for(int k = 0; k < 2; k++){ // ѭ��2��
			//System.out.println("k ==> " + k);
			for(int i = 0; i < 10; i++){ 
				System.out.println("i ---> " + i);
			}
		}
		
		/*
		int i = 0;
		for(int k = 0; k < 2; k++){
			//System.out.println("k's value = " + k);
			for(; i < 10; i++){ 
				System.out.println("k's value = " + k);
				System.out.println("value ---> " + i);
			}
		}
		*/
		
		
		for(int k = 0; k < 2; k++){
			for(int i = 0; i < 10; i++){ 
				System.out.println("k's value = " + k); 
				System.out.println("value ---> " + i); 
			}
		}

		/*
		// ��һ��
		for(int i = 0; i < 10; i++){ 
			System.out.println("i ==> " + i);
		}

		// �ڶ���
		for(int i = 0; i < 10; i++){ 
			System.out.println("i ==> " + i);
		}
		*/

	}
}