
/*
	��дһ���������������ĳ��������n����С������
		���磺���������n��2
		Ҳ����Ҫ���������2����С���������������3

		���磺���������n��9
		Ҳ����Ҫ���������9����С���������������11

		����11����С�������ǣ�13
	
	˼·��
		���ȣ�ϵͳһ�����ȸ���һ����������n����Ȼ�������
		���n����++��ÿ��1�õ�������m�ж�һ���Ƿ�Ϊ������
*/
public class Homework2{

	public static void main(String[] args){

		/*
		// ����Ŀǰϵͳ����һ��������n��nΪ5
		int n = 5;
		// ���ҳ�����5����С������
		while(true){
			n++; // n�Լ�1
			// �жϴ�ʱ��n�Ƿ�Ϊ����
			boolean flag = isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
		*/
		
		// ��һ�������ķ������в���
		/*
		boolean flag = isZhiShu(6);
		System.out.println(flag ? "����" : "������"); // true
		*/

		printZuiXiaoZhiShu(5);
		printZuiXiaoZhiShu(10);
		printZuiXiaoZhiShu(12);
		printZuiXiaoZhiShu(100);
	}

	// �ⷽ������������ӡ��С�����ġ�
	public static void printZuiXiaoZhiShu(int n){
		while(true){
			n++; // n�Լ�1
			// �жϴ�ʱ��n�Ƿ�Ϊ����
			boolean flag = isZhiShu(n);
			if(flag){
				System.out.println(n);
				break;
			}
		}
	}

	// ����һ��ר�ŵķ��������ж�ĳ�������Ƿ�Ϊ����
	// ����������β��ǣ����жϵ�����num
	// ��������ķ���ֵ������true��ʾ����������false��ʾ��������
	public static boolean isZhiShu(int num){
		// ����ô�ж�num�Ƿ���һ������
		// ����ֻ�ܱ�1����������
		for(int i = 2; i < num; i++){ 
			if(num % i == 0){
				return false;
			}
		}
		//�����ܹ�ִ�е��˴�˵��num�Ѿ��������ˡ�
		return true;
	}

}